import java.util.Scanner;

/**
 * program finds the max integer out of 3 integers
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // get the first integer from the user
    System.out.println("What is your first integer?");
    int firstInt = input.nextInt();

    // get the second integer from the user
    System.out.println("What is your second integer?");
    int secondInt = input.nextInt();

    // get the third integer from the user
    System.out.println("What is your third integer?");
    int thirdInt = input.nextInt();

    // check which number is the biggest
    if(firstInt > secondInt && firstInt > thirdInt) {
      System.out.println(firstInt + " is the max number");
    } else if(secondInt > firstInt && secondInt > thirdInt) {
      System.out.println(secondInt + " is the max number");
    }else {
      System.out.println(thirdInt + " is the max number");
    }
    }

    
  
}
