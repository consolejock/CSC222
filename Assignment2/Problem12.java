
import java.util.Scanner;


public class Problem12 {

    public static void main (String[] args){

         Scanner input = new Scanner(System.in);
        System.out.print("Enter the dollar amount: ");
            
        int dollar = input.nextInt();

        int coupons = dollar; 
        int total_chocolates = dollar;

        while (coupons >=6){
            int extra = coupons/6;
            total_chocolates+=extra;

            coupons%=6; 
            coupons+=extra;

        }

    System.out.print("Total Chock: "+ total_chocolates);
    System.out.print("\nCoupons remaining: " +coupons);

}
}