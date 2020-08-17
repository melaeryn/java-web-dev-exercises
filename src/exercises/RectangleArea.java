package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Provide the first dimension:");
        String side1 = input.nextLine();
        System.out.println("Provide the second dimension:");
        String side2 = input.nextLine();
        System.out.println("The area of a rectangle with the provided dimensions is: " + (Integer.parseInt(side1) * Integer.parseInt(side2)));
    }
}