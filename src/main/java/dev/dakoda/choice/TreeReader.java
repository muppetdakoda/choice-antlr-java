package dev.dakoda.choice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TreeReader {

    private final int LINE_NUMBER = 2;

    public void read() {
        try (BufferedReader reader = new BufferedReader(new FileReader(getClass().getClassLoader().getResource("test.choice").getFile()))) {
            String firstLine = "";
            for (int i = 0; i < LINE_NUMBER; i++) {
                firstLine = reader.readLine().trim();
            }
            System.out.println(firstLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TreeReader treeReader = new TreeReader();
        treeReader.read();
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
