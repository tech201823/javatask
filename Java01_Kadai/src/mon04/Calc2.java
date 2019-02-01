package mon04;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * ----- 期待される出力結果
1024 + 255 = 1279
1024 - 255 = 769
1024 * 255 = 261120
1024 / 255 = 4
1024を255で割ったあまりは4
 */
public class Calc2 {
	public static void main(String[] args) {
		int x = 1024;
		int y = 255;

		System.out.println(x + " + " + y + " = " + (x + y));
		System.out.println(x + " - " + y + " = " + (x - y));
		System.out.println(x + " * " + y + " = " + (x * y));
		System.out.println(x + " / " + y + " = " + (x / y));
		System.out.println(x + "を" + y + "で割ったあまりは" + (x % y));
	}
}
