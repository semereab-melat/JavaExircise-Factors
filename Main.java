/************************************************
* Created by: Melat Semereab
* Created on: 23/10/2021
* Program to read in a number and print out the factors of that number
************************************************/
import java.util.Scanner;
//import scanner class
public class Main {

 public static void main(String[] args) {

  // Create a keyboard object
  Scanner keyboard = new Scanner(System.in);
  //Declare variables
  int number;
    //Prompt user
  System.out.print("Enter a positive number : ");
   // Read user input
  number = keyboard.nextInt();
 //start for loop  
  for (int count = 1; count <= number; count ++)
    {
      if ((number % count) == 0) {
    System.out.println(count);
    }//if
  }//for
 }//main
}//class