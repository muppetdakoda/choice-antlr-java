package dev.dakoda.antlr.choice;

import java.util.List;

public class BranchConstant<T> {

    private final T value;

    public BranchConstant(T value) {
        if (
                !(value instanceof Integer || value instanceof Boolean || value instanceof Float
                        || value instanceof String || value instanceof BranchConstantFlexArray)
        ) {
            throw new RuntimeException("Initialising BranchConstant with invalid type [" + value.getClass() + "]");
        }
        this.value = value;
    }

    public Class getValueClass() {
        return value.getClass();
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isFloat() {
        return value instanceof Float;
    }

    public boolean isString() {
        return value instanceof String;
    }

    public boolean isArray() {
        return value instanceof BranchConstantFlexArray;
    }

    public Integer asInteger() {
        return (Integer) value;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    public Float asFloat() {
        return (Float) value;
    }

    public String asString() {
        return (String) value;
    }

    @SuppressWarnings("unchecked")
    public BranchConstantFlexArray asArray() {
        return (BranchConstantFlexArray) value;
    }

    public void asArrayAndAdd(BranchConstant value) {
        if (!(value instanceof List)) {
            throw new RuntimeException("BranchConstant accessed as array when is of type [" + getValueClass() + "]");
        }
        asArray().add(value);
    }

    public T getValue() {
        return value;
    }
}