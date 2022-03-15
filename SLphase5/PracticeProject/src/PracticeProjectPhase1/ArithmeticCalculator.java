package PracticeProjectPhase1;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int firstnumber=scan.nextInt();
		int secondnumber=scan.nextInt();
		System.out.println("enter the operator");
		char operator=scan.next().charAt(0);
		scan.close();
		if(operator=='+')
			System.out.println(firstnumber+secondnumber);
		else if(operator=='-')
			System.out.println(firstnumber-secondnumber);
		else if(operator=='*')
			System.out.println(firstnumber*secondnumber);
		else if(operator=='/')
		{ try {
			System.out.println(firstnumber/secondnumber);
	      	}
		catch(ArithmeticException ae) {
			System.out.println("CAN'T DIVIDED BY ZERO");
		}
		
	   }
	}
}

