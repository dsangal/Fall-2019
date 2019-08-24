import java.util.Scanner;

public class Problem1 {
	public static void main(String [] args){
		Scanner num = new Scanner(System.in);
		int fnum, snum;
		int sum, difference, product, quotient, remainder;
		System.out.println("Enter first num: ");
		fnum = num.nextInt();
		System.out.println("Enter second num: ");
		snum = num.nextInt();
		sum = fnum + snum;
		difference = fnum - snum;
		product = fnum * snum;
		quotient = fnum / snum;
		remainder = fnum % snum;
		System.out.print("Sum: " + sum);
		System.out.println();
		System.out.print("Difference: " + difference);
		System.out.println();
		System.out.print("Product: " + product);
		System.out.println();
		System.out.print("Quotient: " + quotient);
		System.out.println();
		System.out.print("Remainder: " + remainder);
		System.out.println();

	}
}