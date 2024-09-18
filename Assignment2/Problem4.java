import java.util.Scanner;

public class Problem4 {

    public static void main (String[] args){ 
    
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the radius of the well: ");

    double radius; 
    radius = input.nextDouble();

    System.out.print("Please enter the height of the well: ");
    double height;
    height = input.nextDouble();

    double radiusFeet = radius/12;
    
    float cubeFeet = (float) 7.48;

    float volume = (float) ((3.14) * Math.pow(radiusFeet, 2) * (height));


    int gallons = (int) ( volume * cubeFeet);

   //System.out.print(gallons);

    if (gallons >=250){
        System.out.print("A "+height+" foot well of water with a radius of "+radius+" inches for the casing holds about "+gallons+" gallons of water \n" + 
        "Plenty for a family of 4 -- no need to install a seperate tank");
    }
    else{
        System.out.print("A "+height+" foot well of water with a radius of "+radius+" inches for the casing holds about "+gallons+" gallons of water \n" + 
        "Not enough for a family of 4 -- NEED to install a seperate tank");
    }
    }
}