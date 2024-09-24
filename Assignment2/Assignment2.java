import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Assignment2{

    private static Scanner input = new Scanner(System.in);
     public static void main (String[] args){
    
     Problem1();    
     Problem2();
     Problem3();
     Problem4();
     Problem5();
     Problem6();
     Problem7();
     Problem8();
     Problem9();
     Problem10();
     Problem11();
     Problem12();


     }

    public static void Problem1 (){

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
        

      
        System.out.print("The width for 1st string is " + len1 + "\n");
        System.out.print("The width for the 2nd string is  " +len2+"\n");
        System.out.print("The width for both strings combined is " + len3 + "\n");
     
     }

    public static void Problem2(){
        System.out.print("\nPlease enter the following line of text (I love you or I hate you): ");          
       
        String user;
        user = input.nextLine();

      if (user.contains("I love you")){
        System.out.print("\nI have repharsed that line:\n");

        String userOut =user.replace("love", "hate");
        System.out.print(userOut+"\n");
      }
      if (user.contains("I hate you")) {
         System.out.print("\nI have repharsed that line:\n");

        String userOut =user.replace("hate", "love");
        System.out.print(userOut+"\n");


      }


      }

    public static void Problem3(){

       System.out.print("\nPlease enter a favorite color: ");
       String color; 
       color = input.nextLine();

       System.out.print("\nPlease enter a favorite food: ");
       String food;
       food = input.nextLine();

   
       System.out.print("\nPlease enter a favorite animal: ");
       String animal;
       animal = input.nextLine();

       System.out.print("\nPlease enter the first name of friend or relative: ");
       String name; 
       name = input.nextLine();

       System.out.print("I hate a dream that \033[3m"+name+"\033[0m ate a \033[3m"+color+ "\033[0m \033[3m"+animal+ "\033[0m and said it tasted like \033[3m"+food+"\033[0m!\n");
   

     }

    public static void Problem4(){
        
       System.out.print("\nPlease enter the radius of the well: ");

       double radius; 
       radius = input.nextDouble();

       System.out.print("\nPlease enter the height of the well: ");
       double height;
       height = input.nextDouble();

       double radiusFeet = radius/12;
    
       float cubeFeet = (float) 7.48;

       float volume = (float) ((3.14) * Math.pow(radiusFeet, 2) * (height));


       int gallons = (int) ( volume * cubeFeet);


       if (gallons >=250){
         System.out.print("A "+height+" foot well of water with a radius of "+radius+" inches for the casing holds about "+gallons+" gallons of water \n" + 
        "Plenty for a family of 4 -- no need to install a seperate tank\n");
         }
    
      else{
        System.out.print("A "+height+" foot well of water with a radius of "+radius+" inches for the casing holds about "+gallons+" gallons of water \n" + 
        "Not enough for a family of 4 -- NEED to install a seperate tank\n");
    }


    }

    public static void Problem5(){
        System.out.print("\nPlease enter your weight in pounds: ");
        double weight;
        weight = input.nextDouble();

        System.out.print("\nPlease enter your height in inches: ");
        double height;
        height = input.nextDouble();

        System.out.print("\nPlease enter your age: ");
        int age;
        age = input.nextInt();

        float caloriesWomen =(float) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

        float caloriesMen = (float) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

        int wchocalateBars = (int) (caloriesWomen/230);
        int mchoclatebars = (int) (caloriesMen/230);


       System.out.print("\nThe calories needed for a woman to maintain her weight: " +caloriesWomen + "\n" +
      "That would be about " +wchocalateBars+ " chocolate bars. \n");

      
       System.out.print("\nThe calories needed for a man to maintain her weight: " +caloriesMen + ". That would be about " +mchoclatebars+ " chocolate bars\n");

    }

    public static void Problem6(){
        String [] words = new String[3]; 
        int i = 0;
        input.nextLine();
         while(i < words.length){
            System.out.print("\nPlease enter a word: ");
             words[i] = input.nextLine();
             i++;
     }
        Arrays.sort(words);

         System.out.print("Sorted: " + Arrays.toString(words));

            if (words.length > 1){
              System.out.print("\nSecond word: " +words[1]+ "\n");
       }

  
     }
    

    public static void Problem7(){

        System.out.print("\nPlease enter a string: ");
        String str; 
        str = input.nextLine();
        int len1 = str.length();
      

        if (str.contains("?") && len1 % 2 == 0) {
            System.out.print("\nYes");
        }
        
        else if (str.contains("?") && len1 % 1 == 0){
            System.out.print("\nNo");
        }

        else if (str.contains("!")) {
            System.out.print("\nWow");
            
        }

        else{

             System.out.print("\"" +str+ "\"\n");

        }
    }

    public static void Problem8(){
        System.out.print("\nEnter a valid date in mm/dd/yyyy: ");
        String date = "mm/dd/yyyy";
        date = input.nextLine();
       
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat(date);
        simpleDateFormat.setLenient(false);
       
       try {
           Date parseDate = simpleDateFormat.parse(date);
           System.out.print("\nValid" + simpleDateFormat.format(parseDate));
       } 
       
       catch (ParseException e) {
        System.out.print("\nInvalid");
       }

    }

    public static void Problem9(){
         System.out.print("\nPlease enter M(Man) or W(Woman) for gender: ");
        String gender;
        gender = input.nextLine();
        
        System.out.print("\nPlease enter your weight in pounds: ");
        double weight;
        weight = input.nextDouble();

        System.out.print("\nPlease enter your height in inches: ");
        double height;
        height = input.nextDouble();

        System.out.print("\nPlease enter your age: ");
        int age;
        age = input.nextInt();

        if ("W".equals(gender)){
         float caloriesWomen =(float) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));  
         int wchocalateBars = (int) (caloriesWomen/230);
         System.out.print("\nThe calories needed for a woman to maintain her weight: " +caloriesWomen + "\n" +
        "That would be about " +wchocalateBars+ " chocolate bars. \n");

    }

        if ("M".equals(gender)){   
         float caloriesMen = (float) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));
         int mchoclatebars = (int) (caloriesMen/230);
         System.out.print("\nThe calories needed for a man to maintain his weight: " +caloriesMen+ "\n" + 
        "That would be about " +mchoclatebars+ " chocolate bars\n");

}

    }

    public static void Problem10(){
  
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a word: ");

    String word = input.nextLine();


    while(!word.equals("quit")) { 
     boolean hasProperty = true; 
        for (int i = 1; i < word.length(); i++) { 
            char frontCh = word.charAt(i); 
            char backCh = word.charAt(word.length() - i);
        if (frontCh != backCh)
            hasProperty = false;
    }
    if(!hasProperty){
        System.out.println(word + " does not have the property.");
    }
    else{
        System.out.println(word + " has the property.");
    }
    word = input.nextLine();
}
    System.out.print("The program has quit!");

    
    }



    public static void Problem11(){
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
           System.out.print("\nThe number chosen for finalist 3 is: " + number3+"\n");
        }
           
      
    

    public static void Problem12(){
        System.out.print("\nEnter the dollar amount: ");
            
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

    
    

    
