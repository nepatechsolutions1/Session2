
package MyProject;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		
		// >50 - third
		// 51 - 60 - second
		// 61 - 80 - first
		// 81- 100 - distinction
		
		System.out.print("Please input your name: ");
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		System.out.print("Please input PHYSICS score: ");
		int PHYSICS = input.nextInt();
		
		System.out.print("Please input STATISTICS score: ");
		int STATISTICS = input.nextInt();
		
		System.out.print("Please input LITERATURE score: ");
		int LITERATURE = input.nextInt();
		
		System.out.print("Please input PSYCHOLOGY score: ");
		int PSYCHOLOGY = input.nextInt();
		
		System.out.print("Please input BUSINESS score: ");
		int BUSINESS = input.nextInt();
		
		int total = PHYSICS + STATISTICS + LITERATURE + PSYCHOLOGY + BUSINESS;
		float percent = (total / 500.0f) * 100f;
		
		System.out.println(name + ", your percentage is: " + percent);
		
		if (PHYSICS < 35.0F) {
			System.out.println("YOU FAILED PHYSICS, MAINTAIN SPECIAL ATTENTION TO PHYSICS");
		} else if (STATISTICS <35.0F) {
			System.out.println("YOU FAILED STATISTICS, MAINTAIN SPECIAL ATTENTION TO STATISITICS");
		} else if (LITERATURE <35.0F) {
			System.out.println("YOU FAILED LITERATURE, MAINTAIN SPECIAL ATTENTION TO LITERATURE");
		} else if (PSYCHOLOGY <35.0F) {
			System.out.println("YOU FAILED PSYCHOLOGY, MAINTAIN SPECIAL ATTENTION TO PSYCHOLOGY");
		} else if (BUSINESS <35.0F) {
			System.out.println("YOU FAILED BUSINESS, MAINTAIN SPECIAL ATTENTION TO BUSINESS");
		}
			else {
		}
			if (percent < 50.f) {
				System.out.println("YOU RECEIVED GRADE F, PLEASE TRY HARD TO PASS NEXT TIME");
			} else if (percent >= 50 && percent < 70 ) {
				System.out.println("YOU RECEIVED GRADE C, YOU CAN DO BETTER");
			} else if (percent >= 70 && percent < 90 ) {
				System.out.println("YOU RECEIVED GRADE B, GRADE A IS IN THE HORIZON");
			} else {
				System.out.println("YOU RECEIVED GRADE A, EXCELLENT WORK");
			}
		}
		
	}
