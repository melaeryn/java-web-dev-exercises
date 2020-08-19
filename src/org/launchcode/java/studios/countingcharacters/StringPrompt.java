package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class StringPrompt {
    public static void main(String[] args){

        //accepts user input for a string that should be counted
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to be counted:");
        String userInput = input.nextLine();

        //calls our method to count
        HashMap<String, Integer> results = CharacterCount.counted(userInput);

        //prints out result
        for (Map.Entry<String, Integer> value : results.entrySet()) {
            System.out.println(value.getKey() + " (" + value.getValue() + ")");
        }

    }
}
