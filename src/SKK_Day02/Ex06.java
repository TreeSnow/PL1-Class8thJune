package SKK_Day02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		String binaryStr;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a Decimal Number : ");
		num1 = kb.nextInt();
		
		binaryStr = Integer.toBinaryString(num1);
		
		System.out.println("Binary number is: " + binaryStr);	

		kb.close();
	}

}
