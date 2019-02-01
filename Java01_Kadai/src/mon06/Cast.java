package mon06;
/*
 * キャストを使ってデータ型を一時的に変更し、以下のように出力してください。
 * 
 * ----- 期待される出力結果
1.7786458333333333
 */
public class Cast {
	public static void main(String[] args) {
		int x = 1366;
		int y = 768;

		double z = (double)x / y;
		
		System.out.println(z);
	}
}
