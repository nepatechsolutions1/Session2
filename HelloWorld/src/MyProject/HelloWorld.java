
package MyProject;
import java.util.Scanner;

import Utils.Utils;

public class HelloWorld {
	public static void main(String[] args) {
		
		// >50 - third
		// 51 - 60 - second
		// 61 - 80 - first
		// 81- 100 - distinction
		
		System.out.print("Please input your name: ");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.print("Please input science score: ");
		int science = input.nextInt();
		
		System.out.print("Please input math score: ");
		int math = input.nextInt();
		
		System.out.print("Please input english score: ");
		int english = input.nextInt();
		
		System.out.print("Please input nepali score: ");
		int nepali = input.nextInt();
		
		System.out.print("Please input computer score: ");
		int computer = input.nextInt();
		
		int total = science + math + english + nepali + computer;
		float percent = (total / 500.0f) * 100f;
		
		System.out.println(name + ", your percentage is: " + percent);
		
		if (science < 35 || math < 35 || english < 35 || nepali < 35 || computer < 35) {
			System.out.println("YOU FAILED");
		} else {
			if (percent < 50.f) {
				System.out.println("Third Division");
			} else if (percent >= 51 && percent < 60 ) {
				System.out.println("Second Division");
			} else if (percent >= 61 && percent < 80 ) {
				System.out.println("First Division");
			} else {
				System.out.println("Distinction");
			}
		}
		
	}
}
