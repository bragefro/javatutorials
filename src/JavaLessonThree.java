public class JavaLessonThree {
	
	public static void main(String[] args)
	{
		
		char theGrade = 'A';
		
		System.out.print("The jews give you a: ");
		
		switch (theGrade)
	{
		case 'A':
			System.out.println("Great job, goyim");
			break;
		case 'B':
			System.out.println("Good job");
			break;
		case 'C':
			System.out.println("Ok job");
			break;
		case 'D':
			System.out.println("Bad job");
			break;
		default:
			System.out.println("Failure");
			break;
	}
	}	
		
}