import java.util.Scanner;

public class Problem4 {
	public static void main(String [] args){
		Scanner converter = new Scanner(System.in);
		double celsius, fahrenheit;
		System.out.print("Enter the temperature in Celsius: ");
		celsius = converter.nextDouble();
		fahrenheit = (celsius * 1.8) + 3.2;
		System.out.println("It is " + fahrenheit + " degrees Fahrenheit");
	}
}