import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map <String, Integer> wordMap = new HashMap <>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    wordMap.put("Glasgow", 1);
    wordMap.put("Mexico City", 10);
    wordMap.put("Madrid", 2);

    // Get the value associated with a given key in the Map
    wordMap.get("Glasgow");

    // Find the size (number of key/value pairs) of the Map
    wordMap.size();

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    wordMap.replace("Mexico City", 20);

    // Check whether the Map contains a given key
    wordMap.containsKey("Madrid");

    // Check whether the Map contains a given value
    wordMap.containsValue(13);

    // Iterate over the keys of the Map, printing each key
    for(String key : wordMap.keySet())
    {
      System.out.println(key);
    }
    System.out.println();
    // Iterate over the values of the map, printing each value
    for(int value : wordMap.values())
    {
      System.out.println(value);
    }
    System.out.println();
    // Iterate over the entries in the map, printing each key and value
    for(String key : wordMap.keySet())
    {
      System.out.println("Key: " + key + " Value: " + wordMap.get(key));
    }
    
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
