package exercises;
import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> sumArray = new ArrayList<Integer>();
        for( int i = 0 ; i <= 20; i++) {
            sumArray.add(i);
        }
        System.out.println(sum(sumArray));

        Scanner input = new Scanner(System.in);
        System.out.println("How many letters:");
        int number = input.nextInt();

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] seuss2 = seuss.split(" ");
        ArrayList<String> seuss3 = new ArrayList<String>();
        for(String i : seuss2){
            seuss3.add(i);
        }

        howManyLetters(seuss3, number);
    }

    public static int sum(ArrayList<Integer> array){
        int sum = 0;
        for(int i: array){
            if (i%2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void howManyLetters(ArrayList<String> array, int number) {
        for (String i : array) {
            if (i.length() == number) {
                System.out.println(i);
            }
        }
    }
}
