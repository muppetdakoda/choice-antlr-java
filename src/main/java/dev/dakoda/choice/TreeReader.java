package dev.dakoda.choice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreeReader {

    private final int LINE_NUMBER = 26;
    private static int curlyBraces = 0;

    private static boolean withinQuotes = false;
    private static boolean withinIf = false;
    private static boolean withinSwitch = false;
    private static boolean withinVariableBlock = false;

    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(getClass().getClassLoader().getResource("test.choice").getFile()))) {
            for (int i = 0; i < 31; i++) {
                String line = reader.readLine().trim();
                System.out.print(trim(line));
                determineLineType(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void determineLineType(String line) {
        if (line.length() >= 2 && line.substring(0, 2).equals("->")) {
            System.out.println(" (Choice)");
        } else if (line.length() >= 2 && line.substring(0, 2).equals("~>")) {
            System.out.print(" (Choice-specific variables)");
            if (line.matches("~> \\{")) System.out.println(" (Start of block)");
            if (line.matches("};")) System.out.println(" (End of block)");
            if (withinVariableBlock) {
                System.out.println(" (Variable block definition)");
            }
        } else if (line.length() >= 4 && line.substring(0, 4).equals("-if(")) {
            System.out.println(" (If statement)");
        } else if (line.length() >= 8 && line.substring(0, 8).equals("-switch(")) {
            System.out.println(" (Switch statement)");
        } else if (line.matches("\".*\"\\s*->\\s*.*\\s*")) {
            System.out.println(" (Switch choice)");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeReader treeReader = new TreeReader();
        treeReader.read();
    }

    private static String trim(String line) {
        return line.contains("//") ? line.split("//")[0].trim() : line.trim();
    }

    /*
      Valid first lines:
           =>\s\{
           =>\s["].*["]\s\{

      Valid comment:
           \t*[/][/].*

      Nearly a valid choice:
       ->\s*("[\w]*")(,\s*"[\w]*")?(\s*~\s*)?(-then->)?()*

     */
}
