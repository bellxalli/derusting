public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

    // Create an int with a positive value and assign it to a variable

    // Use the modulo % operator to find the remainder when the int is divided by 3

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    // Divide the number by another number using integer division

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

    double negFloat = -1.5;
    int posInt = 1;
    int remainder = posInt % 3;
    if(remainder % 2 == 0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }
    int intDivision = remainder / 5;

  }
}
