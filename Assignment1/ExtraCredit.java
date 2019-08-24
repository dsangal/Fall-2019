import java.util.Scanner;


public class ExtraCredit
{
	public static void main(String[] args)
	{
	    Scanner input=new Scanner(System.in);
	
	    double usr_input;
	
	    System.out.print("Insert dollar amount (e.g 12.56):");
	   
	    usr_input=input.nextDouble() * 100; //converting to cents
	
	    double ten_dollar = (usr_input)/1000;
	    System.out.println("Number of $10 dollar bills = " + (int)ten_dollar);
	
	    usr_input  = (usr_input) % 1000;
	    
	    double temp = usr_input/100;
	    double five_dollar = temp / 5;
	    double one_dollar = temp % 5;
	    
	    System.out.println("Number of $5 dollar bills = " + (int)five_dollar);
	    System.out.println("Number of $1 dollar bills = " + (int)one_dollar);
	    
	    usr_input  = (usr_input) % 100;
	    if (usr_input > 50) {
	    		double fifty_cents = usr_input / 50;
	    		usr_input  = (usr_input) % 50;
	    		System.out.println("Number of 50 cents = " + (int)fifty_cents);
	    }
	    if (usr_input > 25) {
	    		double quarter = usr_input / 25;
	    		usr_input  = (usr_input) % 25;
	    		 System.out.println("Number of Quarters = " + (int)quarter);
	    }
	    if (usr_input > 10) {
	    		double dime = usr_input / 10;
	    		usr_input = (usr_input) % 10;
	    		System.out.println("Number of Dimes = " + (int)dime);
	    }
	    double pennies = usr_input;
	    System.out.println("Number of Pennies = " + (int)pennies);
	}
}