package dev.dakoda.antlr.choice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/***
 * Only allows Integer, Float, Boolean and String objects.
 */
public class BranchConstantFlexArray {

    private ArrayList<BranchConstant> arrayList = new ArrayList<>();

    public void add(BranchConstant ... constants) {
        Arrays.stream(constants).forEach(this::add);
    }

    public void add(BranchConstant reference) {
        Object value = reference.getValue();
        if (
                value instanceof Integer || value instanceof Boolean
                || value instanceof Float || value instanceof String
        ) {
            arrayList.add(reference);
        }
    }

    public BranchConstant get(Integer index) {
        return arrayList.get(index);
    }

    private BranchConstantFlexArray withArrayList(ArrayList<BranchConstant> arrayList) {
        for (BranchConstant branchConstant : arrayList) {
            if (branchConstant.isArray()) {
                throw new RuntimeException("Attempt to nest BranchConstantFlexArrays not permitted.");
            }
        }
        this.arrayList = arrayList;
        return this;
    }

    public static BranchConstantFlexArray build(BranchConstant ... constants) {
        return new BranchConstantFlexArray().withArrayList(new ArrayList<>(Arrays.asList(constants)));
    }

    public Stream<BranchConstant> stream() {
        return arrayList.stream();
    }
}
