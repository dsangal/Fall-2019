import java.util.Scanner;

class Problem2{
	public static final double TAX = 0.0625;
	public static void main(String args[]){
	    Scanner input = new Scanner(System.in);
		String[] item = new String[3]; // creating arrays to store the 3 inputs for each item and the total price of the item
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemPrice = new double[3];
		double subTotal = 0;
		double salesTax = 0;
		double total = 0;
		for (int i = 0; i <3; i++){ //for loop to ask the user for input three times
			System.out.println("Input name of item " + (i + 1) + ":");
			item[i] = input.nextLine();
			
			System.out.println("Input quantity of item " + (i + 1) + ":");
			quantity[i] = input.nextInt();
			
			System.out.println("Input price of item " + (i +1) + ":");
			price[i] = input.nextDouble();

			input.nextLine();
			itemPrice[i] = quantity[i] * price[i]; //figure out total price of item by multiplying quantity with price of item

		}

		subTotal = itemPrice[0] + itemPrice[1] + itemPrice[2]; //figure out subtotal by adding total price of all three items
		salesTax = subTotal * TAX; 
		total = subTotal  + salesTax; //figure out actual total by accounting for sales tax

		System.out.println("Your bill: ");
		System.out.printf("%-30s %-10s %-10s %-10s%n", "Item", "Quantity", 
            "Price", "Total"); // use "%-30s" to create 30 available spaces for item, then use "%-10s" to create 10 available spaces for quantity, price, and total
		for (int j = 0; j < 3; j++){
			System.out.printf("%-30s %-10d %-10.2f %-10.2f%n", item[j], quantity[j], price[j], itemPrice[j]);
		}
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Subtotal", "", "", subTotal);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "6.25% tax", "", "", salesTax);
		System.out.printf("%-30s %-10s %-10s %-10.2f%n", "Total", "", "", total);

		//use "%-10d" to create 10 available spaces for the quantity. use d instead of s because it is not a string variable
		//use "%-10.2f" to create 10 avalable spaces for the price and itemPrice. .2 allows for two spaces after the decimal point
		// in "%-30s" the ' - ' is used to place the variable in the beginning of the 30 spaces instead of at the end
		


	}
}