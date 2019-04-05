package dev.dakoda.choice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private final String regex_string = "(\"\\w+\")";
    private final String regex_number = "([1-9]\\d*(\\.\\d+)?)";
    private final String regex_boolean = "(true|false)";
    private final String regex_stringNumBool = "(" + regex_string + "|" + regex_boolean + "|" + regex_number + ")";

    private final String validRoot = "=>\\s*((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?))|(\\[((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?))(\\s*,\\s*((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?)))*])\\s*\\{";

//    private final String[] validRoots = {
//            "=>\\s*\\{", // no root variables
//            "=>\\s*" + regex_string + "\\s*\\{", // String root
//            "=>\\s*" + regex_number + "\\s*\\{", // number root
//            "=>\\s*" + regex_boolean + "\\s*\\{", // boolean root
//            "=>\\s*\\([" + regex_stringNumBool + "(\\s*,\\s*" + regex_stringNumBool + ")*\\])\\s*\\{", // array root
//            "=>\\s*(" + regex_stringNumBool + "|" + "[" + regex_stringNumBool + "(\\\\s*,\\\\s*" + regex_stringNumBool + ")*\\\\]" + ")\\s*\\{",
//            "=>\\s*(((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?))|[((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?))(\\\\s*,\\\\s*((\"\\w+\")|(true|false)|([1-9]\\d*(\\.\\d+)?)))*\\\\])\\s*\\{",
//    };

    private final String[] validBranches = {
            "\\s*->\\s*" + regex_string + "\\s*~",
            "\\s*->\\s*" + regex_string + "(\\s*,\\s*" + regex_string + ")" + "\\s*~",
            "\\s*->\\s*" + regex_string + "\\s*~",
            "\\s*->\\s*" + regex_string + "\\s*~",
    };

    private Tree tree;

    public void read() {
        Transcript transcript = new Transcript();
        try (BufferedReader reader = new BufferedReader(new FileReader(getClass().getClassLoader().getResource("test.choice").getFile()))) {
            reader.lines().forEach(transcript::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        transcript.clean();
        for (int i = 1; i <= transcript.length(); i++) {
            System.out.println(transcript.get(i));
        }
        for (int i = 1; i <= transcript.length(); i++) {
            System.out.println(checkLineType(transcript.get(i)));
        }
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.read();
    }

    //=> ["asd", "a"] {
    //  -> "choice1", "Choice 1" ~
    //};

    private String checkLineType(String line) {
        if (line.contains("->") && line.contains("\"") && line.contains("~")) {
            char lastChar = line.charAt(line.length() - 1);
            switch (lastChar) {
                case '{':
                    return "nestingBranch";
                case ';':
                    return "branch";
            }
            return "" + line.trim().matches("\\s*->\\s*\"\\w+\"(,\\s*\"[\\w0-9\\s]+\")?\\s*~");
        } else {
            return "";
        }
    }

    private void generateBranch(String line) {

    }
}