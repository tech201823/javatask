package mon07;
/*
 * 問題のある部分を修正し、以下のようにメッセージを出力してください。
 * コードを短く出来る場合は短く修正してもよい。
 * 
 * ----- 期待される出力結果
1 + 2 = 3
3 + 4 = 7
5 + 6 = 11
 */
public class Method2 {
	public static void main(String[] args) {
		int x = 0;
		x = add(1, 2);
		System.out.println(x);
		
		x = add(3, 4);
		System.out.println(x);
		
		x = add(5, 6);
		System.out.println(x);
	}
	
	static int add(int x, int y) {
		System.out.print(x + " + " + y + " = ");
		return x + y;
	}
}
