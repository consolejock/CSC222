import java.util.Scanner;


public class Problem10 {
     public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a word: ");

    String word = input.nextLine(); // read the first word


    while(!word.equals("quit")) { // check if word is not "quit"
     boolean hasProperty = true; // set the boolean variable as true initially for this word
        for (int i = 1; i < word.length(); i++) { // loop through all characters 
            char frontCh = word.charAt(i); 
            char backCh = word.charAt(word.length() - i);
        if (frontCh != backCh)
            hasProperty = false;
    }
    if(!hasProperty){
        System.out.println(word + " does not have the quality");
    }
    else{
        System.out.println(word + " has the quality");
    }
    word = input.nextLine();
    //System.out.print("The program has quit!");
}
    System.out.print("The program has quit!");

        
    }
}

   
