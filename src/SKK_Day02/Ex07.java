package SKK_Day02;

import java.util.Random;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rand1, rand2, rand3, rand4, rand5, rand6, rand7, rand8, rand9, rand10;
		Random random = new Random();

		rand1 = random.nextInt(1, 23);
		System.out.println("First Random Number : " + rand1);
		rand2 = random.nextInt(1, 22 + 1);
		System.out.println("Second Random Number : " + rand2);
		rand3 = random.nextInt(1, 22 + 1);
		System.out.println("Third Random Number : " + rand3);
		rand4 = random.nextInt(1, 22 + 1);
		System.out.println("Fourth Random Number : " + rand4);
		rand5 = random.nextInt(1, 22 + 1);
		System.out.println("Fifth Random Number : " + rand5);
		rand6 = random.nextInt(1, 22 + 1);
		System.out.println("Sixth Random Number : " + rand6);
		rand7 = random.nextInt(1, 22 + 1);
		System.out.println("Seventh Random Number : " + rand7);
		rand8 = random.nextInt(1, 22 + 1);
		System.out.println("Eighth Random Number : " + rand8);
		rand9 = random.nextInt(1, 22 + 1);
		System.out.println("Ninth Random Number : " + rand9);
		rand10 = random.nextInt(1, 22 + 1);
		System.out.println("Tenth Random Number : " + rand10);

//		int randomBetweenOneTo22 = ThreadLocalRandom.current().nextInt(1,23);

	}

}
