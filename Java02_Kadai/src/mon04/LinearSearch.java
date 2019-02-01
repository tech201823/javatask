package mon04;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * なお、以下の出力結果内にある [ ] で囲まれた範囲は、実行中にキーボードから
 * 任意のデータを入力することを意味します。
 * 
 * ----- 期待される出力結果
検索ワードを入力してください＞ Oda
「Oda」は、インデックス「5」に記録されています。
検索試行回数： 5回

検索ワードを入力してください＞ Asaka
「Asaka」は見つかりませんでした。
検索試行回数： 11回
*/
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		String[] src = {
			"Ashikaga", "Imagawa", "Uesugi", "Edo", "Kuki", "Oda", 
			"Kakizaki", "Kinoshita", "Ashikaga", "Kuki", "Kobayakawa", 
		};

		System.out.print("検索ワードを入力してください＞ ");
		String key = sc.next();
		
		int res = 0;
		int count = 0;
		for (int i = 0; i < src.length; i++) {
			if (src[i] == key) {
				res = i;
			}
		}
		count++;
		if (res > 0) {
			System.out.println("「" + key + "」は見つかりませんでした。");
		} else {
			System.out.println("「" + key + "」は、インデックス「" + res + "」に記録されています。");
		}
		System.out.println("検索試行回数： " + count + "回");
		
		sc.close();
	}
}
