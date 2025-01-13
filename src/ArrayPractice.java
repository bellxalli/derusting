public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String [] words = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    words[0] = "Diamond";
    words[1] = "Ruby";
    words[2] = "Pearl";
    words[3] = "Emerald";

    // Get the value of the array at index 2
    String valAtTwo = words[2];

    // Get the length of the array
    int wordsLength = words.length;

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i < words.length; i++)
    {
        System.out.println(words[i]);
    }
    System.out.println();

    // Iterate over the array using a for-each loop and print out each item
    for(String word : words)
    {
      System.out.println(word);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
