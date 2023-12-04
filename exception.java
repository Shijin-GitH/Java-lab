import java.util.Scanner;

public class ExceptionHandlingDemo {

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }

    public static void accessArrayElement(int[] arr, int index) {
        try {
            int value = arr[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers for division: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        divideNumbers(num1, num2);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the index to access in the array: ");
        int index = scanner.nextInt();

        accessArrayElement(array, index);

        scanner.close();
    }
}