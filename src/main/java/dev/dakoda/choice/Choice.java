package dev.dakoda.choice;

import java.util.ArrayList;

public class Choice {

    private ArrayList<Choice> tree = new ArrayList<>();

    public void add(Choice choice) {
        this.tree.add(choice);
    }

    public Choice addGet(Choice choice) {
        this.tree.add(choice);
        return this.tree.get(this.tree.size() - 1);
    }

    public Choice get(int index) {
        return this.tree.get(index);
    }
}