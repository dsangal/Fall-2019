import java.util.Scanner; //import to be able to use scanner

class Problem2 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int years;
		double interest, present, future;
		System.out.println("How much would you like to have in your account? ");
		future = input.nextDouble();
		System.out.println("In how many years? ");
		years = input.nextInt();
		System.out.println("What's the interest? ");
		interest = input.nextDouble();
		interest = interest / 100;
		present = future / Math.pow((1+ interest),years);
		System.out.println("You will need to deposit: " + present);
	}
}