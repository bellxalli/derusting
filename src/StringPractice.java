import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String fiveChar = "Sprinkles";

    // Find the length of the string
    fiveChar.length();

    // Concatenate (add) two strings together and reassign the result
    fiveChar = fiveChar + "Frosting";

    // Find the value of the character at index 3
    char charAtThree = fiveChar.charAt(3);
    //System.out.println(charAtThree);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean hasRink = fiveChar.contains("rink");
    //System.out.println(hasRink);

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < fiveChar.length(); i++)
    {
      System.out.println(fiveChar.charAt(i));
    }
    System.out.println();
    // Create an ArrayList of Strings and assign it to a variable
    List<String> wordList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    wordList.add("Cake");
    wordList.add("Berries");
    wordList.add("Candles");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String combinedList = wordList.get(0) + ", " + wordList.get(1) + ", " + wordList.get(2);
    //System.out.println(combinedList);

    // Check whether two strings are equal
    boolean isEqual = combinedList.equals(fiveChar);
    //System.out.println(isEqual);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
