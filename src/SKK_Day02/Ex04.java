package SKK_Day02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dnum1, dnum2, dnum3, davg;
		Scanner kb = new Scanner(System.in);

		System.out.println("Input first number : ");
		dnum1 = kb.nextDouble();
		System.out.println("Input second number : ");
		dnum2 = kb.nextDouble();
		System.out.println("Input third number : ");
		dnum3 = kb.nextDouble();

		davg = (dnum1 + dnum2 + dnum3) / 3;

		System.out.println("The first number is " + dnum1);
		System.out.println("The second number is " + dnum2);
		System.out.println("The third number is " + dnum3);
		System.out.println("The average of the numbers is " + davg);
kb.close();
	}

}
