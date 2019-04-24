package dev.dakoda.antlr;

import dev.dakoda.antlr.choice.Branch;
import dev.dakoda.antlr.choice.BranchConstant;
import dev.dakoda.antlr.choice.BranchConstantFlexArray;
import dev.dakoda.antlr.choice.Root;

public class ChoiceNavigator extends ChoiceBaseListener {

    private final String REGEX_STRING = "\"\\w+\"";
    private final String REGEX_TRUE = "true";
    private final String REGEX_FALSE = "false";
    private final String REGEX_INTEGER = "\\d+";
    private final String REGEX_BOOLEAN = REGEX_TRUE + "|" + REGEX_FALSE;
    private final String REGEX_FLOAT = REGEX_INTEGER + "." + REGEX_INTEGER;
    @SuppressWarnings("FieldCanBeLocal")
    private final String REGEX_ARRAY =
            "\\[((" + REGEX_STRING + ")|(" + REGEX_INTEGER + ")|(" + REGEX_FLOAT + ")|(" + REGEX_BOOLEAN + "))" +
            "(,\\s*((" + REGEX_STRING + ")|(" + REGEX_INTEGER + ")|(" + REGEX_FLOAT + ")|(" + REGEX_BOOLEAN + ")))*]";

    private Root workingBranch;
    private Branch currentBranch;

    public Root getWorkingBranch() {
        return workingBranch;
    }

    private String wrapRegex(String regex) {
        return "^" + regex + "$";
    }

    private boolean isOnRoot() {
        return currentBranch == null;
    }

    public void enterRoot(ChoiceParser.RootContext ctx) {
        workingBranch = new Root();
    }

    public void enterBranchName(ChoiceParser.BranchNameContext ctx) {
        Branch branch = new Branch();
        branch.setInternalName(ctx.getText().replaceAll("\"", ""));
        if (isOnRoot()) {
            branch.setParentBranch(null);
            workingBranch.addNestingBranch(branch);
            currentBranch = branch;
        } else {
            currentBranch = currentBranch.addNestingBranchAndAccess(branch);
        }
    }

    public void enterBranchVariableOrMethod(ChoiceParser.BranchVariableOrMethodContext ctx) {
        String text = ctx.getText();
        switch (determineTypeFromRegex(text)) {
            case "string": {
                setCurrentBranchConstant(text.replaceAll("\"", ""));
                break;
            } case "boolean": {
                setCurrentBranchConstant(text.matches(REGEX_TRUE));
                break;
            } case "array": {
                setCurrentBranchConstant(mapStringOntoFlexArray(text));
                break;
            } case "float": {
                setCurrentBranchConstant(Float.valueOf(text));
                break;
            } case "integer": {
                setCurrentBranchConstant(Integer.valueOf(text));
                break;
            } default: {
                throw new RuntimeException("Unknown type from String: " + text);
            }
        }
    }

    private BranchConstantFlexArray mapStringOntoFlexArray(String array) {
        BranchConstantFlexArray constantFlexArray = new BranchConstantFlexArray();
        String[] evaluates = array.replaceAll("[\\[\\]]", "").split(",");
        for (String evaluate : evaluates) {
            propagateStringArrayValue(evaluate.trim(), constantFlexArray);
        }
        return constantFlexArray;
    }

    private void propagateStringArrayValue(String value, BranchConstantFlexArray constantFlexArray) {
        switch(determineTypeFromRegex(value)) {
            case "string": {
                constantFlexArray.add(constant(value.replaceAll("\"", "")));
                break;
            } case "boolean": {
                constantFlexArray.add(constant(value.matches(REGEX_TRUE)));
                break;
            } case "float": {
                constantFlexArray.add(constant(Float.valueOf(value)));
                break;
            } case "integer": {
                constantFlexArray.add(constant(Integer.valueOf(value)));
                break;
            } default: {
                throw new RuntimeException("Illegal type from String into Array: " + value);
            }
        }
    }

    private String determineTypeFromRegex(String value) {
        if (value.matches(wrapRegex(REGEX_STRING))) {
            return "string";
        } else if (value.matches(wrapRegex(REGEX_BOOLEAN))) {
            return "boolean";
        } else if (value.matches(wrapRegex(REGEX_ARRAY))) {
            return "array";
        } else if (value.matches(wrapRegex(REGEX_FLOAT))) {
            return "float";
        } else if (value.matches(wrapRegex(REGEX_INTEGER))) {
            return "integer";
        } else {
            return "null";
        }
    }

    private BranchConstant constant(String value) {
        return new BranchConstant<>(value);
    }

    private BranchConstant constant(Boolean value) {
        return new BranchConstant<>(value);
    }

    private BranchConstant constant(Float value) {
        return new BranchConstant<>(value);
    }

    private BranchConstant constant(Integer value) {
        return new BranchConstant<>(value);
    }

    private BranchConstant constant(BranchConstantFlexArray value) {
        return new BranchConstant<>(value);
    }

    private void setCurrentBranchConstant(BranchConstant constant) {
        currentBranch.setConstant(constant);
    }

    private void setCurrentBranchConstant(String string) {
        setCurrentBranchConstant(constant(string));
    }

    private void setCurrentBranchConstant(Boolean bool) {
        setCurrentBranchConstant(constant(bool));
    }

    private void setCurrentBranchConstant(BranchConstantFlexArray array) {
        setCurrentBranchConstant(constant(array));
    }

    private void setCurrentBranchConstant(Float f) {
        setCurrentBranchConstant(constant(f));
    }

    private void setCurrentBranchConstant(Integer integer) {
        setCurrentBranchConstant(constant(integer));
    }
}
