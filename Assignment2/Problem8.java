import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Problem8 {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a valid date in mm/dd/yyyy: ");
        
        String date = "mm/dd/yyyy";
        date = input.nextLine();

        
       
       
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(date);
        simpleDateFormat.setLenient(false);
       
       try {
           Date parseDate = simpleDateFormat.parse(date);
           System.out.print("Valid" + simpleDateFormat.format(parseDate));
       } 
       
       catch (ParseException e) {
        System.out.print("Invalid");
       }

        
        

        
     


    }
}