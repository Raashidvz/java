import java.io.*;
import java.util.*;

public class SeparateEvenOddNumbers {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";    // Input file containing integers
        String evenFile = "even.txt";        // File to store even numbers
        String oddFile = "odd.txt";          // File to store odd numbers

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Read integers from the input file
        try (Scanner scanner = new Scanner(new File(inputFile))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    evenNumbers.add(num);
                } else {
                    oddNumbers.add(num);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: Input file not found!");
            return;
        }

        // Write even numbers to even.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter(evenFile))) {
            for (int num : evenNumbers) {
                writer.println(num);
            }
            System.out.println("Even numbers written to " + evenFile);
        } catch (IOException e) {
            System.err.println("Error writing to even file!");
        }

        // Write odd numbers to odd.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter(oddFile))) {
            for (int num : oddNumbers) {
                writer.println(num);
            }
            System.out.println("Odd numbers written to " + oddFile);
        } catch (IOException e) {
            System.err.println("Error writing to odd file!");
        }
    }
}