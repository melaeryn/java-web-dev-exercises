package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class CharacterCount {
    public static HashMap<String, Integer> counted (String toCount){
        //puts all characters in lower case
        toCount = toCount.toLowerCase();

        //splits the string into an array to be analyzed
        String[] toBeCounted = toCount.split("");

        //creates empty hashmap to store counts
        HashMap<String, Integer> counted = new HashMap<String, Integer>();

        //loop through the array
        for (String i : toBeCounted){
            //ignores non-alphabetical characters
            if(i.matches("^[a-z]*$")) {
                //if it isn't there, add it with a count of 0.
                counted.putIfAbsent(i, 0);
                //replace key value pair with updated value.
                counted.replace(i, counted.get(i) + 1);
            }
        }
        //return the hashMap with results
        return counted;
    }
}
