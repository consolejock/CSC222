import java.util.Scanner;



public class Problem11 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("A number will be chosen for you! \n");
        //int usernumber;
        int number1 = (int) (Math.random() *10 ) +1;
        int number2 = (int) (Math.random() *10 ) +1;
        int number3 = (int) (Math.random() *10 ) +1;
      //  usernumber = input.nextInt();
        
    
            if (number1 == number2) {
                number2 = (int) (Math.random() * 10) + 1; // regenerate number2
            }
            if (number1 == number3) {
                number3 = (int) (Math.random() * 10) + 1; // regenerate number3
            }
            if (number2 == number3) {
                number3 = (int) (Math.random() * 10) + 1; // regenerate number3
            }
            
  
           System.out.print("\nThe number chosen for finalist 1 is: " + number1);
           System.out.print("\nThe number chosen for finalist 2 is: " + number2);
           System.out.print("\nThe number chosen for finalist 3 is: " + number3);
        }
           
      }
    


