import java.util.Scanner;

public class IT24100693Lab5Q3{
//Conatants
private static final double ROOM_RATE = 48000.00;
private static final double DISCOUNT_10 = 0.10;
private static final double DISCOUNT_20 = 0.20;

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

	//Input start end dates
	System.out.print("Enter the start date (1-31) : ");
	int startDate = scanner.nextInt();
	System.out.print("Enter the end date (1-31) : ");
	int endDate = scanner.nextInt();

	//Validate dates
	if(startDate < 1 || startDate > 31 || endDate < 1 || endDate >31){
	System.out.println("Invalid date. Dates must be between 1 and 31." );
	return;
	}
	if(startDate >= endDate){
	System.out.println("Invalid date range. Start date should be less than end date.");
	return;
	}
	
	//Calculate the number of days reserved
	int daysReserved = endDate - startDate;


	//Calculate the total cost 
	double totalCost = daysReserved * ROOM_RATE;
	if(daysReserved >= 3 && daysReserved <= 4){
	totalCost*=(1-DISCOUNT_10);
	} else if (daysReserved >= 5){
	totalCost*=(1-DISCOUNT_20);
	}

	//Display result
	System.out.println("Days reserved :" + daysReserved);
	System.out.println("Total amount to be paid : Rs" + totalCost);

	scanner.close();
	
	}
}	
 






