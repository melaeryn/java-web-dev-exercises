package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        String miles = input.nextLine();
        System.out.println("How much gas (in gallons) have you used?");
        String gallons = input.nextLine();
        System.out.println("Your Miles Per Gallon is: " + (Integer.parseInt(miles) / Integer.parseInt(gallons)));
    }
}