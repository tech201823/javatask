package mon09;
/*
 * 問題のある部分を修正し、不足しているコードを追加して、以下のように出力してください。
 * なお、以下の出力結果内にある [ ] で囲まれた範囲は、実行中にキーボードから
 * 任意のデータを入力することを意味します。
 * 実行後にデータを入力し、動作を確認してください。
 * 
 * ----- 期待される出力結果
あなたの名前は？　[船橋太郎]
一言どうぞ＞　[ひとこと]

船橋太郎さんは言いました。
「ひとこと」
 */

import java.util.Scanner;

public class InputData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		
		
		System.out.print("あなたの名前は？");
		name = sc.next();
		
		System.out.print("ひとこと");
		String message1 = sc.next();
		
		System.out.println("\n" + name + "さんは言いました。");
		System.out.println("「" + message1 + "」");
		sc.close();
	}
}
