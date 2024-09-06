import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import java.nio.file.FileSystemNotFoundException;
import java.util.InputMismatchException;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter an integer value: ");
		int number; int count=0; int ignored =0; int sum = 0; 
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		Scanner scan = new Scanner(System.in);

		while(true) {
			
			try {
			number = scan.nextInt();
			
		
			if (number < 0) {
			
				ignored++;
				//count--;
				scan.nextLine();
				break;
				
				
			}
			
		
		
				
			sum+=number;
			count++;
			
			if (number < min) {
				min = number;
			}
			
			if (number > max) {
				max = number;
			}
			
			System.out.print("Please enter an integer value: ");
			}
			catch (InputMismatchException e){
				System.out.print("Please enter an integer value: ");
				scan.next(); 
				continue;
			}
		
		
			
		}
		
	
	
	
	//System.out.print("Please enter an integer value: ");
		int average = (sum/count);
		
		//System.out.print("User inputs: " + count + "\n");
		//System.out.print("The entry ignored: " + ignored + "\n");
		
		System.out.print("The Highest value is " + max + "\n");
		System.out.print("The Lowest value is "  + min + "\n");
		
		System.out.print("The Average value is " + average + "\n");
		System.out.print(ignored + " entry was ignored");
	


	}
}
		
/*
		System.out.print("Please enter an integer value: ");
		
		number = scnr.nextInt();
		
		System.out.print("Please enter an integer value: ");
		
		number = scnr.nextInt();
		
		int Max = Math.max(number, number);
		
		System.out.print("Max is " + Max);
		
	*/
		

		
		
		
		
			
		
		
		
	
	


