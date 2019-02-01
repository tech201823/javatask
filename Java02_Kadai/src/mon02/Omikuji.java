package mon02;

import java.util.Random;
import java.util.Scanner;

/*
 * 問題のある部分を修正し、以下のように出力してください。
 * コンピュータは運勢を、「大吉」、「吉」、「中吉」、「小吉」、「末吉」、「凶」のいずれかから選択します。
 * コンピューターが選ぶ運勢はランダムに選択されるため、以下と同じデータになるとは限りません。
 * なお、以下の出力結果内にある [ ] で囲まれた範囲は、実行中にキーボードから
 * 任意のデータを入力することを意味します。
 * 
 * ----- 期待される出力結果
名前を入力してください： [船橋太郎]
船橋太郎さんの、今の運勢は中吉です
*/
public class Omikuji {
	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		String[] unsei = {"大吉","中吉","小吉","末吉","凶"};
		
		System.out.print("名前を入力してください： ");
		String name = sc.next();
		
		int n = rnd.nextInt(name.length() * rnd.nextInt(unsei.length)) % unsei.length;
		String unsei1 =unsei[n]; 
		System.out.println(name + "さんの、今の運勢は" + unsei1 + "です");
		
		sc.close();
	}
}
