import java.io.*;
import java.util.StringTokenizer;

public class SumOfIntegersFromFile {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide the file path as a command line argument.");
            return;
        }

        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line == null) {
                System.out.println("File is empty.");
                return;
            }

            StringTokenizer tokenizer = new StringTokenizer(line);
            int sum = 0;

            System.out.println("Integers in the file:");

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                int number = Integer.parseInt(token);
                System.out.println(number);
                sum += number;
            }

            System.out.println("Sum of all integers: " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure all tokens in the file are integers.");
        }
    }
}