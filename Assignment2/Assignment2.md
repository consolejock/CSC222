Purpose
This coding assignment is aligned with module learning objectives #1, #2, #3, and #4. 

Directions
Write a program that calls methods for each of the following mini problems from its main method.

Us a single Scanner for the program declared in the class as
private Static Scanner keyboard = new Scanner(System.in);


1. Write a method that reads two strings from the user’s keyboard. Display each string, along with its width, on two separate lines. Then create a new string by joining the two strings with a space between them. Display the new string and its length on a new separate line.
 

2. Write a method that reads a line of text from the keyboard and then displays the line, but with the first occurrence of hate changed to love. For example, a possible sample dialogue might be
Enter a line of text.
I hate you.
I have rephrased that line to read:
I love you.

You can assume that the word hate occurs in the input. If the word hate occurs more than once in the line, your program will replace only its first occurrence.

3. Write a method that asks the user to enter a favorite color, a favorite food, a favorite animal, and the first name of a friend or relative. The program should then print the following two lines, with the user’s input replacing the items in italics: I had a dream that Name ate a Color Animal and said it tasted like Food!
For example, if the user entered blue for the color, hamburger for the food, dog for the animal, and Jake for the person’s name, the output would be
I had a dream that Jake ate a blue dog and said it tasted like hamburger!
Don’t forget to put the exclamation mark at the end.

4. Many private water wells produce only 1 or 2 gallons of water per minute. One way to avoid running out of water with these low-yield wells is to use a holding tank.  A family of 4 will use about 250 gallons of water per day.  However, there is a “natural” water holding tank in the casing (i.e. the hole) of the well itself.  The deeper the well, the more water that will be stored that can be pumped out for household use.  But how much water will be available? 
Write a method that allows the user to input the radius of the well casing in inches (a typical well will have a 3 inch radius) and the depth of the well in feet (assume water will fill this entire depth, although in practice that will not be true since the static water level will generally be 50 feet or more below the ground surface).  The program should output the number of gallons stored in the well casing.
For your reference:
The volume of a cylinder is  where r is the radius and h is the height.
1 cubic foot = 7.48 gallons of water.
For example, a 300 foot well full of water with a radius of 3 inches for the casing holds about 441 gallons of water -- plenty for a family of 4 and no need to install a separate holding tank.
 

5. The Harris-Benedict equation estimates the number of calories your body needs to maintain your weight if you do no exercise. This is called your basal metabolic rate or BMR.
The calories needed for a woman to maintain her weight is:
BMR = 655 + (4.3 * weight in pounds) + (4.7 * height in inches) - (4.7 * age in years)
The calories needed for a man to maintain his weight is:
BMR = 66 + (6.3 * weight in pounds) + (12.9 * height in inches) - (6.8 * age in years)
A typical chocolate bar will contain around 230 calories.
Write a method that allows the user to input their weight in pounds, height in inches, and age in years.  The program should then output the number of chocolate bars that should be consumed to maintain one’s weight for both a woman and a man of the input weight, height, and age.
 

6. Write a method that reads three strings from the keyboard. Although the strings are in no particular order, display the string that would be second if they were arranged lexicographically.

7. Write a method that reads a one-line sentence as input and then displays the following response: If the sentence ends with a question mark (?) and the input contains an even number of characters, display the word Yes. If the sentence ends with a question mark and the input contains an odd number of characters, display the word No. If the sentence ends with an exclamation point (!), display the word Wow. In all other cases, display the words You always say followed by the input string enclosed in quotes. Your output should all be on one line. Be sure to note that in the last case, your output must include quotation marks around the echoed input string. In all other cases, there are no quotes in the output. Your program does not have to check the input to see that the user has entered a legitimate sentence.
Notes: This code requires a three-way selection statement and gives more practice with string methods.  The case statement can be used since the control expression is a single character.  It may be instructive to show the code using if/else, instead, and compare them for readability.  

8. Write a method that reads a string from the keyboard and tests whether it contains a valid date. Display the date and a message that indicates whether it is valid. If it is not valid, also display a message explaining why it is not valid. The input date will have the format mm/dd/yyyy. A valid month value mm must be from 1 to 12 (January is 1). The day value dd must be from 1 to a value that is appropriate for the given month. September, April, June, and November each have 30 days. February has 28 days except for leap years when it has 29. The remaining months all have 31 days each. A leap year is any year that is divisible by 4 but not divisible by 100 unless it is also divisible by 400.
Notes: This project provides an opportunity to introduce format checking.  The solution uses case logic in combination with compound Boolean expressions.

 

9. Repeat the calorie counting program from problem 5 in a new method. This time ask the user to input the string “M” if the user is a man and “W” if the user is a woman.   Use only the male formula to calculate calories if “M” is entered and use only the female formula to calculate calories if “W” is entered.  Output the number of chocolate bars to consume as before.
 

10. For all of the following words, if you move the first letter to the end of the word, and then spell the result backwards you will get the original word:

banana dresser grammar potato revive uneven assess

Write a method that reads a word and determines whether it has this property. Continue reading and testing words until you encounter the word quit. Treat uppercase letters the same as lowercase letters. Display how many words you found when you finish.
 

11. You have three identical prizes to give away and a pool of 10 finalists. The finalists are assigned numbers from 1 to 10.  Write a method to randomly select the numbers of 3 finalists to receive a prize.  Make sure not to pick the same number twice.  For example, picking finalists 3, 6, 2 would be valid but picking 3, 3, 11 would be invalid because finalist number 3 is listed twice and 11 is not a valid finalist number.   For this problem you can insert the following line of code to generate a random number between 1 and 10:
int num = (int) (Math.random() * 10) +1;
Notes: This project uses random numbers in a loop.  You might wish to introduce the Random class instead of Math.random(). 

 

12. Suppose we can buy a chocolate bar from the vending machine for $1 each. Inside every chocolate bar is a coupon.  We can redeem 6 coupons for one chocolate bar from the machine.  This means that once you have started buying chocolate bars from the machine, you always have some coupons. We would like to know how many chocolate bars can be eaten if we start with N dollars and always redeem coupons if we have enough for an additional chocolate bar.

For example, with 6 dollars we could consume 7 chocolate bars after purchasing 6 bars giving us 6 coupons and then redeeming the 6 coupons for one bar.  This would leave us with one extra coupon.  For 11 dollars, we could have consumed 13 chocolate bars and still have one coupon left.  For 12 dollars, we could have consumed 14 chocolate bars and have two coupons left.

Write a method that takes input for the value for N and outputs to the terminal how many chocolate bars we can eat and how many coupons we would have leftover.  Use a loop that continues to redeem coupons as long as there are enough to get at least one chocolate bar.