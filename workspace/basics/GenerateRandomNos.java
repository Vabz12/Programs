package basic;

import java.util.Random;

public class GenerateRandomNos {

	public static void main(String[] args) {

		// Math Class accessing random method .
		System.out.println("The Math class : "+(int) (Math.random() * 10));

		// Random Classs import
		Random r = new Random();
		for (int i = 1; i < 10; i++) {
			System.out.println("The Random class : "+r.nextInt(10));
		}

	}

}
