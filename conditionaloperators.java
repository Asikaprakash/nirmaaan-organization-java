package day4;
import java.util.Scanner;

public class conditionaloperators {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your marks");
	int mark=sc.nextInt();
	if(mark>=10 && mark<=100) {
		System.out.println("Pass");
		if(mark>=65) 
			System.out.println("Grade A");
		else if(mark>=50)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
		}
			
	
	
	else {
			System.out.println("invalid");
	}
		
		
	}

}
