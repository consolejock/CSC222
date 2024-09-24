//2.2
//A simple Java program appears below.
/*

A program starts in main(), executing the statements within main's braces { }, one at a time.
Each statement typically appears alone on a line and ends with a semicolon, as English sentences end with a period.
The int wage statement creates an integer variable named wage. The wage = 20 statement assigns wage with 20.
The print and println statements output various values.

*/
public class First_Program {                       

  public static void main (String [] args) {
      int wage;

      wage = 20;                        

      System.out.print("Salary is ");       
      System.out.println(wage * 40 * 52);   
  }
}



// Basic Scanner Input 
//  Scanner is a text parser that can get numbers, words, or phrases from an input source such as the keyboard. Getting input is achieved by first creating a Scanner object via the statement: Scanner scnr = new Scanner(System.in);. System.in corresponds to keyboard input. Then, given Scanner object scnr, the following statement gets an input value and assigns x with that value: x = scnr.nextInt() ;


import java.util.Scanner;

public class Salary {
   public static void main(String [] args) {
      int wage;

      Scanner scnr = new Scanner(System.in);
      wage = scnr.nextInt();

      System.out.print("Salary is ");
      System.out.println(wage * 40 * 52);
   }
}