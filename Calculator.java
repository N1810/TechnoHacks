package TechnoHacks;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter The Number:- ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Enter The Second Number:-");
		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();
		System.out.println("Enter The Opertion You Want To Perform:-");
		Scanner sc3 = new Scanner(System.in);
		String st = sc3.next();
		switch (st) {
		case "+":
			System.out.println("The Sum Of The Number Is :-" + (num + num2));
			break;
		case "-":
			System.out.println("The Difference of The Number Is:-" + (num - num2));
			break;
		case "*":
			System.out.println("The Product Of The Number Is:-" + (num * num2));
			break;
		case "/":
			System.out.println("The Quotient Of The Number Is:-" + (num / num2));
			break;
		case "%":
			System.out.println("The Remainder of The Number Is:-" + (num % num2));
			break;
		default:
			System.out.println("Please Enter The Valid Operation");
		}

	}

}
