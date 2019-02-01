package mon05;
/*
 * コンピュータがランダムに選ぶ10000個の数値の度数分布を求めます。
 * コンピュータは1～100までの数値をランダムに選ぶため、各範囲のデータは
 * 以下の出力結果とまったく同じにはなりません。
 * 
 * ----- 期待される出力結果
1-10> 1027
11-20> 1041
21-30> 994
31-40> 985
41-50> 954
51-60> 1030
61-70> 1046
71-80> 967
81-90> 967
91-100> 989
振り分けたデータの個数： 10000
*/
import java.util.Random;
public class FreqDist {
	public static void main(String[] args) {
		final Random rnd = new Random(System.currentTimeMillis());
		int[] value = new int[10];
		
		for (int i = 0; i < 10000; i++) {
			int r = (rnd.nextInt(100) + 1) % 10;
			value[r] = value[r] + 1;
			i=i+100;
		}
		
		int sum = 0;
		for (int i = 0; i < 1; i++) {
			System.out.println((i + 1) + "-" + ((i + 100)) + "> " + value[i]);
			sum = value[i];
		}
		System.out.println("振り分けたデータの個数： " + sum);
	}
}
