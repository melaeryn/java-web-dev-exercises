package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by \n" +
                "her sister on the bank, and of having nothing to do: once or \n" +
                "twice she had peeped into the book her sister was reading, \n" +
                "but it had no pictures or conversations in it, 'and what \n" +
                "is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What is your search term?");
        String searchTerm = input.nextLine();
        if(sentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("The following paragraph: \n\n" + sentence +
                    "\n\nDOES contain the search term '" + searchTerm + "'.");
        }
        else{
            System.out.println("The following paragraph: \n\n" + sentence +
                    "\n\nDOES NOT contain the search term '" + searchTerm + "'.");
        }
    }
}
