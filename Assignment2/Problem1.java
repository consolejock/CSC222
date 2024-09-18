import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a string: ");

        String str1;
        str1 = input.nextLine();

        int len1 = str1.length(); 

        System.out.print("Please enter another string: ");
        String str2;
        str2 = input.nextLine();

        int len2 = str2.length();

        String str3;

        str3 = str1 + str2;
        int len3 = str3.length();
        

      //  System.out.print("The length is " +len1); 
        System.out.print("The width for 1st string is " + len1 + "\n");
        System.out.print("The width for the 2nd string is  " +len2+"\n");
        System.out.print("The width for both strings combined is " + len3 + "\n");
      
        

        }
}