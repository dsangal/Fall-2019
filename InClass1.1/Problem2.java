import java.util.Scanner;

public class Problem2 {
	public static void main(String [] args){
		Scanner radius = new Scanner(System.in);
		int rad, area, circumference;
		int pi = 2;
		System.out.print("Radius: ");
		rad = radius.nextInt();
		area = pi * rad * rad;
		circumference = 2 * pi * rad;
		System.out.print("Area: " + area);
		System.out.println();
		System.out.print("Circumference: " + circumference);
		System.out.println();
	}
}