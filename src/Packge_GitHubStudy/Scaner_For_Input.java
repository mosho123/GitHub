package Packge_GitHubStudy;

import java.util.Scanner;

public class Scaner_For_Input {

	public static void main(String[] args) 
	{ 
		
		// below program for user want to give some inputs and take output so 
		// below i have done 2 programs 
		//1. integer 2. string use karun
		
		Scanner sc = new Scanner(System.in);
		
		// below program for user value enter sathi not programmer defined
		// below is int type
		/*
		int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 
		 int sum=num1+num2;
		 
		 System.out.println(sum);
		*/
		
		// below is string type
		
		String name = sc.next();
		String Lastname = sc.next();
		
		System.out.println("name is " + name + " lastname is " + Lastname);
		

	}

}
