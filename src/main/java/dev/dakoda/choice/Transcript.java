package dev.dakoda.choice;

import java.util.ArrayList;
import static java.util.stream.Collectors.toList;

public class Transcript {

    private ArrayList<String> lines = new ArrayList<>();

    public void add(String line) {
        lines.add(line);
    }

    public String get(Integer lineNumber) {
        return lines.get(lineNumber - 1);
    }

    public int length() {
        return lines.size();
    }

    public String getFirst() {
        return get(0);
    }

    public String getLast() {
        return get(length());
    }

    public void clean() {
        cleanComments();
    }

    private void cleanComments() {
        lines.removeIf(line -> line.trim().matches("\\t*//.*"));
        lines = (ArrayList<String>) lines.stream()
                .map(line -> line.matches(".*//.*") ? line.split("//")[0] : line)
//                .filter(line -> !line.trim().matches("\\t*//.*"))
                .collect(toList());
    }
}
