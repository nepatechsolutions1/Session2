import java.util.Scanner;

public class ASSIGNMENT {
	
		public static void main(String[] args) {
			
			
			System.out.print("Please input your name: ");
			
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			
			System.out.print("Please input INTRO TO DRAFTING score: ");
			int DRAFTING = input.nextInt();
			
			System.out.print("Please input RISK MANAGEMENT score: ");
			int RISKMGMT = input.nextInt();
			
			System.out.print("Please input CHEMISTRY 1402 score: ");
			int CHEMISTRY = input.nextInt();
			
			System.out.print("Please input INTERNAL CORROSION score: ");
			int INTERNALCORR = input.nextInt();
			
			System.out.print("Please input METALLURGY score: ");
			int METALLURGY = input.nextInt();
			
			int total = DRAFTING + RISKMGMT + CHEMISTRY + INTERNALCORR + METALLURGY;
			float percent = (total / 500.0f) * 100f;
			
			System.out.println(name + ", your percentage is: " + percent);
			
			if (DRAFTING < 70.0F) {
				System.out.println("YOU FAILED");
			} else if (CHEMISTRY <70.0F) {
				System.out.println("YOU FAILED");
			} else if (RISKMGMT <35.0F) {
				System.out.println("YOU FAILED");
			} else if (INTERNALCORR <70.0F) {
				System.out.println("YOU FAILED");
			} else if (METALLURGY <70.0F) {
				System.out.println("YOU FAILED");
			}
				else {
			}
				if (percent < 60.f && percent < 70) {
					System.out.println("YOU FAILED WITH GRADE D");
				} else if (percent >= 70 && percent < 80 ) {
					System.out.println("YOU PASSED WITH GRADE C");
				} else if (percent >= 80 && percent < 90 ) {
					System.out.println("YOU PASSED WITH GRADE B");
				} else if (percent >= 90){
					System.out.println("YOU PASSED WITH GRADE A");
				}
			}
			
		}
		


