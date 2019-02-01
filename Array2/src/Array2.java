import java.util.Random;

public class Array2 {
	public static void main(String[] args) {
		int[] std = new int[1000000];
		Random rnd = new Random();
		for (int j = 0; j < 1000000; j++) {
			std[j] = rnd.nextInt(500) + 1;
		}
		std[0] = 433;
		for (int i = 0; i < 10; i++) {
			System.out.println("std[" + i + "]=" + std[i]);
		}
	}
}
