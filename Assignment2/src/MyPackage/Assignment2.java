package MyPackage;
import java.util.Scanner;


public class Assignment2 {
	public static void main(String[] args) {
	
		
		System.out.print("Please input your name: ");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.print("Please input quiz score: ");
		int quiz = input.nextInt();
		
		System.out.print("Please input midterm score: ");
		int midterm = input.nextInt();
		
		System.out.print("Please input final score: ");
		int fin = input.nextInt();
		
			
		int total = quiz+midterm+ fin;
		float percent = (total / 300.0f) * 100f;
		
		System.out.println(name + ", your percentage is: " + percent);
		
		if(percent < 0.0f || percent < 100.0f)
			System.out.println("Wrong Input!");
		else 
			{
			if (percent < 50.f) {
			
			System.out.println("Grade F");
		} else if (percent >= 51 && percent < 70 ) {
			System.out.println("Grade C");
		} else if (percent >= 71 && percent < 90 ) {
			System.out.println("Grade B");
		} else {
			System.out.println("Grade A");
		}
			}
		
		
		input.close();
		
	}
}