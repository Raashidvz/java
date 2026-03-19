// SeparateImportsUsingList.java
import java.io.*;
import java.util.*;

public class SeparateImports {
    public static void main(String[] args) {

        String inputFile = "input.java";
        String importFile = "imports.txt";
        String codeFile = "code.txt";

        List<String> importLines = new ArrayList<>();
        List<String> codeLines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(inputFile))) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String trimmedLine = line.trim();

                if (trimmedLine.startsWith("import ")) {
                    importLines.add(line);   
                } else {
                    codeLines.add(line);  
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
            return;
        }

       
        try (PrintWriter writer = new PrintWriter(new FileWriter(importFile))) {
            for (String line : importLines) {
                writer.println(line);
            }
            System.out.println("Import statements written to " + importFile);
        } catch (IOException e) {
            System.out.println("Error writing import file!");
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(codeFile))) {
            for (String line : codeLines) {
                writer.println(line);
            }
            System.out.println("Remaining code written to " + codeFile);
        } catch (IOException e) {
            System.out.println("Error writing code file!");
        }
    }
}
