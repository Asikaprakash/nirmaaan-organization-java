package day5;
import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Simple calcualtor");
	System.out.println("Enter the first number");
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	System.out.println("Enter 1 for Addition");
	System.out.println("Enter 2 for Subtraction");
	System.out.println("Enter 3 for Multipication");
	System.out.println("Enter 4 for Divison");
	System.out.println("Enter 5 for Modulus");
	int key=sc.nextInt();
	
	switch(key) {
		case 1:{
			System.out.println("Additon"+(num1+num2));
			break;
			
		}
		case 2:{
			System.out.println("Subtraction"+(num1-num2));
			break;
		}
		case 3:{
			System.out.println("Multipication"+(num1*num2));
			break;
			
		}
		case 4:{
			System.out.println("Division"+(num1/num2));
			break;
			
		}
		case 5:{
			System.out.println("Modulus"+(num1%num2));
			break;
			
		}
		default:
		System.out.println("Invalid");
		
		
		
		}
	}
	
	

}
