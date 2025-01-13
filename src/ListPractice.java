import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> wordList= new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    wordList.add("Hello");
    wordList.add("Beautiful");
    wordList.add("World");

    // Print the element at index 1
    System.out.println(wordList.get(1));
    System.out.println();

    // Replace the element at index 1 with a new value
    wordList.set(1, "Hi");

    // (Do not insert a new value. The length of the list should not change)

    // Insert a new element at index 0 (the length of the list will change)
    wordList.add(0,"Hola");

    // Check whether the list contains a certain string
    wordList.contains("World");
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < wordList.size(); i++)
    {
        System.out.println("Index: " + i + " Value: "+ wordList.get(i));
    }
    System.out.println();
    // Sort the list using the Collections library
    Collections.sort(wordList);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String word : wordList)
    {
        System.out.println("Value: " + word + " ");
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}