// Generated from dev.dakoda.antlr/Choice.g4 by ANTLR 4.7
package dev.dakoda.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChoiceParser}.
 */
public interface ChoiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varFloat}.
	 * @param ctx the parse tree
	 */
	void enterVarFloat(ChoiceParser.VarFloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varFloat}.
	 * @param ctx the parse tree
	 */
	void exitVarFloat(ChoiceParser.VarFloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varInteger}.
	 * @param ctx the parse tree
	 */
	void enterVarInteger(ChoiceParser.VarIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varInteger}.
	 * @param ctx the parse tree
	 */
	void exitVarInteger(ChoiceParser.VarIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varNumber}.
	 * @param ctx the parse tree
	 */
	void enterVarNumber(ChoiceParser.VarNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varNumber}.
	 * @param ctx the parse tree
	 */
	void exitVarNumber(ChoiceParser.VarNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varBoolean}.
	 * @param ctx the parse tree
	 */
	void enterVarBoolean(ChoiceParser.VarBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varBoolean}.
	 * @param ctx the parse tree
	 */
	void exitVarBoolean(ChoiceParser.VarBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varString}.
	 * @param ctx the parse tree
	 */
	void enterVarString(ChoiceParser.VarStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varString}.
	 * @param ctx the parse tree
	 */
	void exitVarString(ChoiceParser.VarStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchName}.
	 * @param ctx the parse tree
	 */
	void enterBranchName(ChoiceParser.BranchNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchName}.
	 * @param ctx the parse tree
	 */
	void exitBranchName(ChoiceParser.BranchNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(ChoiceParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(ChoiceParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchDisplay}.
	 * @param ctx the parse tree
	 */
	void enterBranchDisplay(ChoiceParser.BranchDisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchDisplay}.
	 * @param ctx the parse tree
	 */
	void exitBranchDisplay(ChoiceParser.BranchDisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#arrayOfValues}.
	 * @param ctx the parse tree
	 */
	void enterArrayOfValues(ChoiceParser.ArrayOfValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#arrayOfValues}.
	 * @param ctx the parse tree
	 */
	void exitArrayOfValues(ChoiceParser.ArrayOfValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#commaSeparatedVariables}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparatedVariables(ChoiceParser.CommaSeparatedVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#commaSeparatedVariables}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparatedVariables(ChoiceParser.CommaSeparatedVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#simpleVariable}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVariable(ChoiceParser.SimpleVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#simpleVariable}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVariable(ChoiceParser.SimpleVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ChoiceParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ChoiceParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ChoiceParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ChoiceParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#methodInnerVariable}.
	 * @param ctx the parse tree
	 */
	void enterMethodInnerVariable(ChoiceParser.MethodInnerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#methodInnerVariable}.
	 * @param ctx the parse tree
	 */
	void exitMethodInnerVariable(ChoiceParser.MethodInnerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#methodWithoutParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodWithoutParams(ChoiceParser.MethodWithoutParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#methodWithoutParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodWithoutParams(ChoiceParser.MethodWithoutParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#methodWithParams}.
	 * @param ctx the parse tree
	 */
	void enterMethodWithParams(ChoiceParser.MethodWithParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#methodWithParams}.
	 * @param ctx the parse tree
	 */
	void exitMethodWithParams(ChoiceParser.MethodWithParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(ChoiceParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(ChoiceParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(ChoiceParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(ChoiceParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#simpleBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBooleanExpression(ChoiceParser.SimpleBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#simpleBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBooleanExpression(ChoiceParser.SimpleBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#reversedBoolean}.
	 * @param ctx the parse tree
	 */
	void enterReversedBoolean(ChoiceParser.ReversedBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#reversedBoolean}.
	 * @param ctx the parse tree
	 */
	void exitReversedBoolean(ChoiceParser.ReversedBooleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#variableKeywords}.
	 * @param ctx the parse tree
	 */
	void enterVariableKeywords(ChoiceParser.VariableKeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#variableKeywords}.
	 * @param ctx the parse tree
	 */
	void exitVariableKeywords(ChoiceParser.VariableKeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#variableKeywordInnerVariable}.
	 * @param ctx the parse tree
	 */
	void enterVariableKeywordInnerVariable(ChoiceParser.VariableKeywordInnerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#variableKeywordInnerVariable}.
	 * @param ctx the parse tree
	 */
	void exitVariableKeywordInnerVariable(ChoiceParser.VariableKeywordInnerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ChoiceParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ChoiceParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#elseContent}.
	 * @param ctx the parse tree
	 */
	void enterElseContent(ChoiceParser.ElseContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#elseContent}.
	 * @param ctx the parse tree
	 */
	void exitElseContent(ChoiceParser.ElseContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#rootStart}.
	 * @param ctx the parse tree
	 */
	void enterRootStart(ChoiceParser.RootStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#rootStart}.
	 * @param ctx the parse tree
	 */
	void exitRootStart(ChoiceParser.RootStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#nestEnd}.
	 * @param ctx the parse tree
	 */
	void enterNestEnd(ChoiceParser.NestEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#nestEnd}.
	 * @param ctx the parse tree
	 */
	void exitNestEnd(ChoiceParser.NestEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ChoiceParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ChoiceParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchVariableOrMethod}.
	 * @param ctx the parse tree
	 */
	void enterBranchVariableOrMethod(ChoiceParser.BranchVariableOrMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchVariableOrMethod}.
	 * @param ctx the parse tree
	 */
	void exitBranchVariableOrMethod(ChoiceParser.BranchVariableOrMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(ChoiceParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(ChoiceParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#blankBranch}.
	 * @param ctx the parse tree
	 */
	void enterBlankBranch(ChoiceParser.BlankBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#blankBranch}.
	 * @param ctx the parse tree
	 */
	void exitBlankBranch(ChoiceParser.BlankBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#simpleBranch}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBranch(ChoiceParser.SimpleBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#simpleBranch}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBranch(ChoiceParser.SimpleBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#nestingBranch}.
	 * @param ctx the parse tree
	 */
	void enterNestingBranch(ChoiceParser.NestingBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#nestingBranch}.
	 * @param ctx the parse tree
	 */
	void exitNestingBranch(ChoiceParser.NestingBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#switchBranch}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranch(ChoiceParser.SwitchBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#switchBranch}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranch(ChoiceParser.SwitchBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#switchBranchNormal}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBranchNormal(ChoiceParser.SwitchBranchNormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#switchBranchNormal}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBranchNormal(ChoiceParser.SwitchBranchNormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#switchBlankBranch}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlankBranch(ChoiceParser.SwitchBlankBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#switchBlankBranch}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlankBranch(ChoiceParser.SwitchBlankBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#ifBranchTernary}.
	 * @param ctx the parse tree
	 */
	void enterIfBranchTernary(ChoiceParser.IfBranchTernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#ifBranchTernary}.
	 * @param ctx the parse tree
	 */
	void exitIfBranchTernary(ChoiceParser.IfBranchTernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchVar}.
	 * @param ctx the parse tree
	 */
	void enterBranchVar(ChoiceParser.BranchVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchVar}.
	 * @param ctx the parse tree
	 */
	void exitBranchVar(ChoiceParser.BranchVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchSimpleVar}.
	 * @param ctx the parse tree
	 */
	void enterBranchSimpleVar(ChoiceParser.BranchSimpleVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchSimpleVar}.
	 * @param ctx the parse tree
	 */
	void exitBranchSimpleVar(ChoiceParser.BranchSimpleVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchNestingVar}.
	 * @param ctx the parse tree
	 */
	void enterBranchNestingVar(ChoiceParser.BranchNestingVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchNestingVar}.
	 * @param ctx the parse tree
	 */
	void exitBranchNestingVar(ChoiceParser.BranchNestingVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#simpleNest}.
	 * @param ctx the parse tree
	 */
	void enterSimpleNest(ChoiceParser.SimpleNestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#simpleNest}.
	 * @param ctx the parse tree
	 */
	void exitSimpleNest(ChoiceParser.SimpleNestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#varNest}.
	 * @param ctx the parse tree
	 */
	void enterVarNest(ChoiceParser.VarNestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#varNest}.
	 * @param ctx the parse tree
	 */
	void exitVarNest(ChoiceParser.VarNestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#branchNestingVarContent}.
	 * @param ctx the parse tree
	 */
	void enterBranchNestingVarContent(ChoiceParser.BranchNestingVarContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#branchNestingVarContent}.
	 * @param ctx the parse tree
	 */
	void exitBranchNestingVarContent(ChoiceParser.BranchNestingVarContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(ChoiceParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(ChoiceParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ChoiceParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ChoiceParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(ChoiceParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(ChoiceParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ChoiceParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ChoiceParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selectorSwitch}.
	 * @param ctx the parse tree
	 */
	void enterSelectorSwitch(ChoiceParser.SelectorSwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selectorSwitch}.
	 * @param ctx the parse tree
	 */
	void exitSelectorSwitch(ChoiceParser.SelectorSwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selectorSwitchContent}.
	 * @param ctx the parse tree
	 */
	void enterSelectorSwitchContent(ChoiceParser.SelectorSwitchContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selectorSwitchContent}.
	 * @param ctx the parse tree
	 */
	void exitSelectorSwitchContent(ChoiceParser.SelectorSwitchContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selectorIf}.
	 * @param ctx the parse tree
	 */
	void enterSelectorIf(ChoiceParser.SelectorIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selectorIf}.
	 * @param ctx the parse tree
	 */
	void exitSelectorIf(ChoiceParser.SelectorIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selectorIfNormal}.
	 * @param ctx the parse tree
	 */
	void enterSelectorIfNormal(ChoiceParser.SelectorIfNormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selectorIfNormal}.
	 * @param ctx the parse tree
	 */
	void exitSelectorIfNormal(ChoiceParser.SelectorIfNormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChoiceParser#selectorIfElse}.
	 * @param ctx the parse tree
	 */
	void enterSelectorIfElse(ChoiceParser.SelectorIfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChoiceParser#selectorIfElse}.
	 * @param ctx the parse tree
	 */
	void exitSelectorIfElse(ChoiceParser.SelectorIfElseContext ctx);
}