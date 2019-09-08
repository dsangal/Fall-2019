import java.util.Scanner;

class Problem1{
	public static void main (String []args){
		Scanner input = new Scanner(System.in);
		String input2 = "";
		boolean begin = true; 

		while (begin) { //while loop runs while the boolean is true
				System.out.print("How many days? "); // user input for days to measure growth
				int days =0;
				days = input.nextInt();
				System.out.print("Initial weight: ");
				int pounds = 0;
				pounds = input.nextInt();
				int prevWeight  = 0;
				int currWeight = pounds;
				System.out.println(pounds);
				int finalWeight = currWeight;
				
				for (int i = 0; i < days/5; i++) {
					finalWeight = currWeight + prevWeight; 
					currWeight = prevWeight;
					prevWeight = finalWeight;
					System.out.println( "finalWeight = " + finalWeight + " pounds");
			}
			System.out.println("Final weight: " + finalWeight);
			System.out.println("Continue? (Y/N)");
			input2 = input.next();
			if (input2.equalsIgnoreCase("N")) {
				begin = false;
			}
		}
		


	}
}
