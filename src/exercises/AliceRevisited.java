package exercises;

import java.util.Scanner;

public class AliceRevisited {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by \n" +
                "her sister on the bank, and of having nothing to do: once or \n" +
                "twice she had peeped into the book her sister was reading, \n" +
                "but it had no pictures or conversations in it, 'and what \n" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What term would you like to remove?");
        String searchTerm = input.nextLine();
        if(sentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            int index = sentence.indexOf(searchTerm.toLowerCase());
            sentence = sentence.substring(0 , index) + sentence.substring(index+searchTerm.length());
            System.out.println("The following paragraph: \n\n" + sentence +
                    "\n\nHas had the word '" + searchTerm + "' removed at index "+ index +".");
        }
        else{
            System.out.println("The following paragraph: \n\n" + sentence +
                    "\n\nDOES NOT contain the term '" + searchTerm + "'.");
        }
    }
}
