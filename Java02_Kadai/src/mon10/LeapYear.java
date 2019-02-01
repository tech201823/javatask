package mon10;
/*
 * 問題のある部分を修正し、以下のようにメッセージを出力してください。
 * コードを短く出来る場合は短く修正してもよい。
 * 
 * ----- 期待される出力結果
 * --- うるう年の場合
西暦＞2020
2020年はうるう年です

 * --- うるう年ではない場合
西暦＞2018
2018年はうるう年ではありません
 */
import java.util.Scanner;
public class LeapYear {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("西暦＞");
		int year = sc.nextInt();
		if (year%4==0) {
			System.out.println(year + "年はうるう年です");
		} else {
			System.out.println(year + "年はうるう年ではありません");
		}
	}
	
	static boolean isLeapYear(int year) {
		// うるう年と判定できれば true を返す
		if (year == 0) {
			return true;
		}
		// うるう年でなければ false を返す
		return false;
	}
}
