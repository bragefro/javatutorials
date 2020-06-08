import java.util.Scanner;

public class JavaLessonTwo
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Your favourite number: ");
		if (userInput.hasNextInt())
		{
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);
		
			int numberEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numberEnteredTimes2);
			
			int numberEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - 2 = " + numberEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * "+ numberEntered + " = " + numEnteredTimesSelf);
			
			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + " / 2 = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 = " + numEnteredRemainder);
	
		} else {
			System.out.println("I asked for a number, dumbass");
		}
	}
}