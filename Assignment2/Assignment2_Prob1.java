import java.util.Scanner;

class Problem1 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		double guess, root, n;
		int counter = 0;
		System.out.println("Square root of: ");
		n = input.nextDouble();
		guess = n / 2;
		while (counter < 5){
			root = n / guess;
			guess = (guess + root) / 2;
			counter++;
		}
		System.out.printf("%.2f",guess);
		System.out.println();

	}
}