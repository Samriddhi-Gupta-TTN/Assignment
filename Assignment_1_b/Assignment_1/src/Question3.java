
import java.util.Scanner;

class CircleCalculator{
    static double calArea(double radius){
        return Math.PI * radius * radius;
    }
    static double calCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
public class Question3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double radius;

        do {
            System.out.println("****MENU****");
            System.out.println("Calculate area of circle");
            System.out.println("Calculate circumference of circle");
            System.out.println("Exit");
            System.out.println("Choose an option (1-3)- ");

            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.println("Enter the radius");
                radius = sc.nextDouble();
            } else {radius = 0;
        }
        switch (choice) {
            case 1:
                double area = CircleCalculator.calArea(radius);
                System.out.printf("Area of the circle: %.2f%n", area);
                break;
            case 2:
                double circumference = CircleCalculator.calCircumference(radius);
                System.out.printf("Circumference of the circle: %.2f%n", circumference);
                break;
            case 3:
                System.out.printf("end");
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println();
    } while (choice != 3);
}}
