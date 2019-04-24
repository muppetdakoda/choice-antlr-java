package dev.dakoda.antlr.choice;

import java.util.ArrayList;

public class Root {

    private BranchConstant constant;
    private ArrayList<Branch> nestingBranches = new ArrayList<>();

    public BranchConstant getConstant() {
        return constant;
    }

    public ArrayList<Branch> getNestingBranches() {
        return nestingBranches;
    }

    public void addNestingBranch(Branch branch) {
        this.nestingBranches.add(branch);
    }

    public Branch addNestingBranchAndAccess(Branch branch) {
        this.nestingBranches.add(branch);
        return nestingBranches.get(nestingBranches.size() - 1);
    }
}
