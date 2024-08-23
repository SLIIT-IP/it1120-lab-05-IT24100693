import java.util.Scanner;
 
public class IT24100693Lab5Q1{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	//Get three input
	System.out.print("Enter first integer:");
	int numb1 = scanner.nextInt();
	
	System.out.print("Enter the second integer:");
	int numb2 = scanner.nextInt();
	
	System.out.print("Enter the third integer:");
	int numb3 = scanner.nextInt();
	
	int largest,smallest;

	//Determine the largest number
	if(numb1>= numb2 && numb1>= numb3){
		largest = numb1;
	}else if(numb2>= numb1 && numb2>= numb3){
		largest = numb2;
	}else{
		largest = numb3;
	}
	
	//Determine the smallest number
	if(numb1<= numb2 && numb1<= numb3){
		smallest = numb1;
	}else if(numb2<= numb1 && numb2<= numb3){
		smallest = numb2;
	}else{
		smallest = numb3;
	}
	
	//Display the result
	System.out.println("Largest number:" + largest);
	System.out.println("smallest number:" + smallest);
	
	scanner.close();
	
	
	}
}


	
