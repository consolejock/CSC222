import java.util.Scanner;

public class Words {
     public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");

        String word = input.nextLine();

        //String reverse = ""; 
        char frontch;
        char backch;
    while(!word.equals("quit")){
        boolean hasProperty;
        hasProperty = true;

        for (int i = 0; i < word.length(); i++) {
            frontch = word.charAt(i);
            backch = word.charAt(word.length() - i);
            if (frontch != backch)
                hasProperty = false;
            

        }

        if (hasProperty)
            System.out.print(word +" does not have the quality");

        

        else 

            System.out.print(word + "has the quality  ");
            //word = input.nextLine();
            word = input.nextLine();
       // System.out.print("The program has quit");
    }
   // System.out.print(reverse);

   //System.out.print("The program has quit");
        
     }
}