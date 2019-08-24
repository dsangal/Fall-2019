import java.util.Scanner; //import to be able to use scanner

class Problem1 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("How many seconds? ");
		int seconds = input.nextInt();
		int hours = seconds / 3600;
		System.out.println(hours);
		seconds = seconds % 3600;
		int minutes = seconds / 60;
		System.out.println(minutes);
		seconds = seconds % 60;
		int sec = seconds / 60;
		System.out.println(seconds);

	}
}