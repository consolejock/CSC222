import java.util.Scanner;

public class Problem3 {

 public static void main (String[] args){

    Scanner input = new Scanner (System.in);
    //Ask for user favorite color
    System.out.print("Please enter a favorite color: \n");
    String color; 
    color = input.nextLine();
   // Font colorFont = new Font("Italic", Font.BOLD, 12);

   System.out.print("Please enter a favorite food: \n");
   String food;
   food = input.nextLine();

   
   System.out.print("Please enter a favorite animal: \n");
   String animal;
   animal = input.nextLine();

   System.out.print("Please enter the first name of friend or relative: \n");
   String name; 
   name = input.nextLine();

   System.out.print("I hate a dream that \033[3m"+name+"\033[0m ate a \033[3m"+color+ "\033[0m \033[3m"+animal+ "\033[0m and said it tasted like \033[3m"+food+"\033[0m!");
   
   //System.out.print("\033[3m " +color+ " \033[0m");

    
    
    //
}   

}