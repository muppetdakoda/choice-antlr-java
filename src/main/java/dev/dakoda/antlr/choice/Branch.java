package dev.dakoda.antlr.choice;

import java.util.ArrayList;
import java.util.Arrays;

public class Branch {

    private String internalName;
    private String display = "";
    private BranchConstant constant;
    private ArrayList<Branch> nestingBranches = new ArrayList<>();
    private Branch parentBranch;

    public Branch() {

    }

    public Branch(Branch parent, String internalName) {
        this.parentBranch = parent;
        this.internalName = internalName;
    }

    public Branch(Branch parent, String internalName, BranchConstant constant) {
        this(parent, internalName);
        this.constant = constant;
    }

    public Branch(Branch parent, String internalName, String display, BranchConstant constant) {
        this(parent, internalName, constant);
        this.display = display;
    }

    public Branch addNestingBranchAndAccess(Branch branch) {
        this.nestingBranches.add(branch);
        return nestingBranches.get(nestingBranches.size() - 1);
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setNestingBranches(ArrayList<Branch> nestingBranches) {
        this.nestingBranches = nestingBranches;
    }

    public void setParentBranch(Branch parentBranch) {
        this.parentBranch = parentBranch;
    }

    public String getInternalName() {
        return internalName;
    }

    public String getDisplay() {
        return display;
    }

    public BranchConstant getConstant() {
        return constant;
    }

    public void setConstant(BranchConstant constant) {
        this.constant = constant;
    }

    public void setNestingBranches(Branch ... branches) {
        this.nestingBranches = (ArrayList<Branch>) Arrays.asList(branches);
    }

    public ArrayList<Branch> getNestingBranches() {
        return nestingBranches;
    }

    public Branch getParentBranch() {
        return parentBranch;
    }
}
