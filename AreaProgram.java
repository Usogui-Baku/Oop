import java.util.Scanner;

/**
 * A program that calculates the area of various geometric shapes.
 *
 * This program presents a menu-driven interface that allows users to calculate the area of
 * a square, circle, or triangle. The program continues to display the menu until the user
 * selects the exit option.
 */
public class AreaProgram {
  /**
   * The entry point of the AreaProgram application.
   *
   * Displays a menu of shape options and prompts the user to enter the desired option.
   * Based on the user's selection, the program calculates and displays the area of the
   * selected shape. The program repeats until the user chooses to exit.
   *
   * @param args 
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int option;

    do {
      System.out.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
      System.out.print("Enter the desired option[1-4]: ");
      option = input.nextInt();

      switch (option) {
        case 1:
          System.out.println("Calculating area of a square...");
          System.out.print("Enter the length of the side: ");
          double side = input.nextDouble();
          double squareArea = side * side;
          System.out.println("The area of the square is: " + squareArea);
          break;
        case 2:
          System.out.println("Calculating area of a circle...");
          System.out.print("Enter the radius of the circle: ");
          double radius = input.nextDouble();
          double circleArea = Math.PI * radius * radius;
          System.out.println("The area of the circle is: " + circleArea);
          break;
        case 3:
          System.out.println("Calculating area of a triangle...");
          System.out.print("Enter the base of the triangle: ");
          double base = input.nextDouble();
          System.out.print("Enter the height of the triangle: ");
          double height = input.nextDouble();
          double triangleArea = 0.5 * base * height;
          System.out.println("The area of the triangle is: " + triangleArea);
          break;
        case 4:
          System.out.println("Exiting the program.");
          break;
        default:
          System.out.println("Invalid option. Please try again.");
      }
    } while (option != 4);
    input.close();
  }
}