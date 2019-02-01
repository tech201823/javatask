package mon07;
/*
 * コメントに従い、比較式による結果を出力してください。
 * なお、問題のある部分は修正し、変数aと変数bを利用すること。
 * 
 * ----- 期待される出力結果
63 < 92 = true
63 <= 92 = true
63 > 92 = false
63 >= 92 = false
63 == 92 = false
63 != 92 = true
 */
public class Comparison {
	public static void main(String[] args) {
		int a = 63;
		int b = 92;
		
		// aがb未満ならば真、そうでなければ偽
		System.out.println(a + " < " + b + " = " + (a < b));
		
		// aがb以下ならば真、そうでなければ偽
		System.out.println(a + " <= " + b + " = " + (a < b));
		
		// aがbを超すならば真、そうでなければ偽
		System.out.println(a + " > " + b + " = " + (a < b));
		
		// aがb以上ならば真、そうでなければ偽
		System.out.println(a + " >= " + b + " = " + (a < b));
		
		// aとbが同値ならば真、そうでなければ偽
		System.out.println(a + " == " + b + " = " + (a < b));
		
		// aとbが異なるならば真、そうでなければ偽
		System.out.println(a + " != " + b + " = " + (a < b));
	}
}
