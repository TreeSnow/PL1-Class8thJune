package SKK_Day02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, temp;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input first number : ");
		num1 = kb.nextInt();
		System.out.println("Input second number : ");
		num2 = kb.nextInt();

		System.out.println("Before swaping, first number is " + num1);
		System.out.println("Before swaping, second number is " + num2);
		System.out.println("======================================== ");

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swaping, first number is " + num1);
		System.out.println("After swaping, second number is " + num2);

		kb.close();
	}

}
