package day12;
import java.util.Scanner;

public class TrafficFine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle Type: ");
		int Vehicle = sc.nextInt();
		System.out.println("Enter your speed: ");
		int speed = sc.nextInt();
		System.out.println("Enter speed limit: ");
		int limit = sc.nextInt();
		
		int Extraspeed = speed - limit;
		if(Vehicle==2) {
			if(Extraspeed>=1 && Extraspeed<10)
				System.out.println("Fine Amount 500");
			else if(Extraspeed>=10 && Extraspeed<20)
				System.out.println("Fine Amount 1000");
			else if(Extraspeed>=20)
				System.out.println("Fine Amount 2000");
			else
				System.out.println("No Fine. Drive safely! ");
		}
		else if(Vehicle == 4) {
			if(Extraspeed>=1 && Extraspeed<10)
				System.out.println("Fine Amount 1000");
			else if(Extraspeed>=10 && Extraspeed<20)
				System.out.println("Fine Amount 2000");
			else if(Extraspeed>=20)
				System.out.println("Fine Amount 3000");
			else
				System.out.println("No fine.Drive safety!");
		}
		else {
			System.out.println("Wrong vehicle");
		}
	}

}
