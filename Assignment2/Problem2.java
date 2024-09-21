import java.util.Scanner;

public class Problem2 {

    public static void main (String[] args){
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a line of text:");          
        
        String user;

      //  String userHateInput;
     
        user = input.nextLine();
        //userHateInput = input.nextLine();

      if (user.contains("I love you")){
        System.out.print("I have repharsed that line:\n");

        String userOut =user.replace("love", "hate");
        System.out.print(userOut);
      }
      if (user.contains("I hate you")) {
         System.out.print("I have repharsed that line:\n");

        String userOut =user.replace("hate", "love");
        System.out.print(userOut);


      }




        
     /*   if (userHateInput == "I hate you"){
        //userHateInput = input.nextLine();
        String userHateOutput = userHateInput.replace("hate", "love");
        System.out.print(userHateOutput);
        }
        
   */     
        
        
        
    
}
}