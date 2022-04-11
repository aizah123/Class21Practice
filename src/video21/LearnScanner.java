package video21;

import java.util.Scanner;

public class LearnScanner {
	
public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
//	//System.out.println("Inshallah I have to do it");
//	System.out.println("What is your name?");
//	String name=scan.nextLine();
//	System.out.println("My name is:" +name);
//	System.out.println("How many kids you have?");
//	int kids = scan.nextInt();
//	System.out.println("Alhamdullah i have :"+kids);
//	System.out.println("How much is your weekly salary?");
//	double salary= scan.nextDouble();
//	System.out.println("My salary is not good. it is  $" +salary);
//	System.out.println("enter your monthly salary\n");
//	
//	double monthlySalary=salary*4;
//	//System.out.printf("My monthly salary is:" + "%.2f",monthlySalary );
//	System.out.println("My monthly salary is:$" +String.format("%.2f", monthlySalary));
		
	System.out.println("Enter quantity of Pen");
	int pen = scan.nextInt();
	System.out.println("The quantity of pen is : " + pen);
	System.out.println("Enter the price of each pen");
	double penPrice= scan.nextDouble();
	System.out.println("Each pen price is: $\n" +penPrice);
	System.out.println("what are the total pen price?\n");
	double totalPenPrice= pen*penPrice;
	System.out.printf("The total pen price is : $" + "%.2f", totalPenPrice);
	scan.close();
			
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
