/*
The following code checks whether a number input by the user is an Armstrong number of not.
An Armstrong number is a number that is the sum of its own digits each raised to the power 
of the number of digits.e.g 153 = 1^3 + 5^3 + 3^3
*/
 
import java.util.*;
class ArmstrongCheck 
{
	public static void main(String args[])
	{
		int input = 0, digit_count = 0, sum = 0, bak = 0, digit = 0;
		System.out.println("Please enter a number to check if it's an Armstrong number.");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		bak = input; // backs up the number
		while(input != 0) // counts the number of digits in the number
		{
			input = input / 10;
			++digit_count;
		}
		input = bak;  // restores the original number
		while(input != 0)
		{
			digit = input % 10; // stores the digits of the number
			sum = sum + (int)Math.pow(digit, digit_count); // Explicitly casts pow() to int and computes the sum
			input = input / 10;
		}
		if(sum == bak)
			System.out.println("The number is an Armstrong number.");
		else
			System.out.println("The number is not an armstrong number.");
	}	
} // end