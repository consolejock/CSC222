import java.util.Scanner;

public class Assignment2 {

    public static void main (String[] args){
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a line of text:");          
        
        String userLoveInput;

      //  String userHateInput;
        
        userLoveInput = input.nextLine();
        //userHateInput = input.nextLine();

        System.out.print(("I have repharsed that line to read: "));

        String userLoveOutput =userLoveInput.replace("love", "hate");
     
    
    
        System.out.print(userLoveOutput);
        
     /*   if (userHateInput == "I hate you"){
        //userHateInput = input.nextLine();
        String userHateOutput = userHateInput.replace("hate", "love");
        System.out.print(userHateOutput);
        }
        
   */     
        
        
        
    
}
}