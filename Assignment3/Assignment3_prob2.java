import java.util.Scanner;

class Problem2{
	static double func(int x, int i){
		double top = Math.pow(x,i);
		double bottom = 1;
		for (i = 1; i <= x; i++){
			bottom = bottom * i;
		}
		double expression = top / bottom;
		return expression;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		boolean begin = true;
		String input2 = "";
		while (begin){
			System.out.print("Enter your input: ");
			int userInput = 0;
			userInput = input.nextInt();
			double num = 1;
			for (int i = 1; i <= 100; i++){
			num = num + func(i,userInput);
			if (i <= 10 || i == 50 || i == 100){
				System.out.println("At n = " + i + ", x= " + num);
			}
			}
			System.out.println("Continue? (Y/N)");
			input2 = input.next();
			if (input2.equalsIgnoreCase("N")) {
						begin = false;
		}
		}
		
	}
}