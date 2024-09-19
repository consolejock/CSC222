
import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {

 public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    String [] words = new String[3]; 

    for (int i = 0; i < words.length; i++){
        System.out.print("Please enter a string: ");
        words[i] = input.nextLine();
    }

  /* System.out.println("Words: ");
    for (String word: words){
        System.out.print(" "+ word);
    }
*/
    Arrays.sort(words);

     System.out.print("Sorted: " + Arrays.toString(words));

    if (words.length > 1){

        System.out.print("\n" +words[1]);
    }

   //System.out.print(Arrays.toString(words));
    }
}