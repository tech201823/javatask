package mon09;
/*
 * 問題のある部分を修正し、以下のようにメッセージを出力してください。
 * コードを短く出来る場合は短く修正してもよい。
 * 
 * ----- 期待される出力結果
 * --- 偶数の場合
数値を入力＞128
128は偶数です

 * --- 奇数の場合
数値を入力＞111
111は奇数です
 */
import java.util.Scanner;
public class EvenOdd {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int x;

		System.out.print("数値を入力＞");
		x = sc.nextInt();

		if (x%2==0) {
			System.out.println(x + "は偶数です");
		} else {
			System.out.println(x + "は奇数です");
		}
		sc.close();
	}
	
	static boolean isEven(int x) {
		// 偶数でなければ false を返す
		if (x != 0) return false;

		// 偶数ならば true を返す
		return true;
	}
}
