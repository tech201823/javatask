package mon03;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * ----- 期待される出力結果
456 + 123 = 579
456 - 123 = 333
456 * 123 = 56088
456 / 123 = 3
456 を 123で割ったあまりは 87
 */
public class Calc {
	public static void main(String[] args) {
		System.out.println("456 + 123 = " + (456 + 123));
		System.out.println("456 - 123 = " + (456 - 123));
		System.out.println("456 * 123 = " + (456 * 123));
		System.out.println("456 / 123 = " + (456 / 123));
		System.out.println("456 を 123で割ったあまりは  " + (456 % 123));
	}
}
