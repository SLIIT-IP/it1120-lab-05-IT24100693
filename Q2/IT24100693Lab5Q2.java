import java.util.Scanner;

public class IT24100693Lab5Q2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		//input the number of new members 
		System.out.print("Enter the number of new members introduced :");
		int newMembers = scanner.nextInt();

		//validate input
		if(newMembers<0){
		System.out.println("Invalid input. The member of new membercannot be less than 0.");
		return;
		}

		//Determine the price 
		String prize;
		switch (newMembers) {
		case 0: prize = "No prize";break;
		case 1: prize = "pen";break;
		case 2: prize = "Umbrella";break;
		case 3: prize = "bag";break;
		case 4: prize = "Travelling chair";break;
		default: prize = "Headphone";break;
		}

		//Display the prize
		System.out.println("You are entitled to:" + prize);

		scanner.close();



	}


}