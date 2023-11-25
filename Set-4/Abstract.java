import java.util.Scanner;

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("A rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("A triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("A hexagon has 6 sides.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a shape (rectangle, triangle, hexagon):");
        String shapeType = scanner.nextLine().toLowerCase();

        Shape shape;
        switch (shapeType) {
            case "rectangle":
                shape = new Rectangle();
                break;
            case "triangle":
                shape = new Triangle();
                break;
            case "hexagon":
                shape = new Hexagon();
                break;
            default:
                System.out.println("Invalid shape!");
                return;
        }

        shape.numberOfSides();
    }
}