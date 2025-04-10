package day6;

import java.util.Scanner;

public class Forlooptask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int iteration = sc.nextInt();
		for(int i=1;i<=iteration;i++)
			{
				if(i%3==0) {
					System.out.println(i);
				}
			}
			
			for(int i=1;i<=iteration;i++)
			{
				if(i%3==0) {
				
					System.out.println("Asika");
				}
				
				else {
					System.out.println(i);
				}
	}
			 
			int count =0;
			for(int i=1;i<=iteration;i++)
			{
				if(i%3==0)
				{
					count++;
				}
			}
				System.out.println("the count is :"+count);
			}
		}



