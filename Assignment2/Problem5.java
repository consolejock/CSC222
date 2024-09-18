import java.util.Scanner;

public class Problem5 {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Please enter your weight in pounds: ");
        double weight;
        weight = input.nextDouble();

        System.out.print("Please enter your height in inches: ");
        double height;
        height = input.nextDouble();

        System.out.print("Please enter your age: ");
        int age;
        age = input.nextInt();

       float caloriesWomen =(float) (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

       float caloriesMen = (float) (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

       int wchocalateBars = (int) (caloriesWomen/230);
       int mchoclatebars = (int) (caloriesMen/230);


       System.out.print("The calories needed for a woman to maintain her weight: " +caloriesWomen + "\n" +
      "That would be about " +wchocalateBars+ " chocolate bars. \n");

      
       System.out.print("\nThe calories needed for a man to maintain her weight: " +caloriesMen+ "\n" + 
       "That would be about " +mchoclatebars+ " chocolate bars \n");




    


        

    }
}