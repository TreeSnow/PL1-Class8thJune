package SKK_Day02;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, num5, num6;
		double dnum1, dnum2, res;

		num1 = 1;
		num2 = 3;
		num3 = 5;
		num4 = 7;
		num5 = 9;
		num6 = 11;

		dnum1 = 1.0;
		dnum2 = 4.0;

		res = dnum2 * (num1 - (dnum1 / num2) + (dnum1 / num3) - (dnum1 / num4) + (dnum1 / num5) - (dnum1 / num6));
		System.out.println(res);

	}

}
