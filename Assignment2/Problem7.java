import java.util.Scanner;


public class Problem7 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str; 
        str = input.nextLine();
        int len1 = str.length();
      
        //System.out.print(len1);

        if (str.contains("?") && len1 % 2 == 0) {
            System.out.print("Yes");
        }
        
        else if (str.contains("?") && len1 % 1 == 0){
            System.out.print("No");
        }

        else if (str.contains("!")) {
            System.out.print("Wow");
            
        }

        else{

             System.out.print("\"" +str+ "\"");

        }
    }
}