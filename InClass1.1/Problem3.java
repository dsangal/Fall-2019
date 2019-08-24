import java.util.Scanner;

public class Problem3 {
	public static void main(String [] args) {
		Scanner swap = new Scanner(System.in);
		int fnum, snum;
		System.out.print("A. ");
		fnum = swap.nextInt();
		System.out.print("B. ");
		snum = swap.nextInt();
		System.out.print("Before swap: a,b = ");
		System.out.print(fnum + " " + snum);
		System.out.println();
		int temp;
		temp = fnum;
		fnum = snum;
		snum = temp;
		System.out.print("After swap: a,b = ");
		System.out.print(fnum + " " + snum);
		System.out.println();
	}
}