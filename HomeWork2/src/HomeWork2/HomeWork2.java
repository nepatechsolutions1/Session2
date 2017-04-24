

package HomeWork2;

import java.util.Scanner;

public class HomeWork2 {
	
	public static void main(String[] args) {

	System.out.print("Please input your name:");
	
	Scanner input = new Scanner(System.in);
	String name = input.nextLine();
	


/**
 * if the average score >=90% =>grade=A -
 * if the average score >= 70% and <90% => grade=B -
 * if the average score>=50% and <70% =>grade=C -
 * if the average score<50% =>grade=F 
 * Create a new branch in our shared repo with your name, and push
 *  your code to that branch.
 */
	
	


	int QuizScore = 98;
	int MidTermScore = 88;
	int FinalScore = 90;
	int AverageScore = (QuizScore + MidTermScore + FinalScore) / 3; 
	
	

	if (AverageScore >= 90){
		System.out.println( "Excellent Work! Keep it up. Your Grade is A");
	}
	else if((AverageScore >=70) && (AverageScore <90)) {
		System.out.println("Good Work! Your Grade is  B");
	}
	else if((AverageScore >=50) && (AverageScore <70)){
		System.out.println( "You still need to work harder next time. Your Grade is  C");
	}			
	else (AverageScore <50) {
		System.out.println("You really need to work extra hard next time . Your Grade is  F");
		
		
		}


	}
}
