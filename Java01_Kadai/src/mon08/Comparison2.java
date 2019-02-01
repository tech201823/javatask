package mon08;
/*
 * コメントに従い、論理演算子を使って以下の結果を出力してください。
 * なお、問題のある部分は修正すること。
 * 
 * ----- 期待される出力結果
true && true = true
true && false = false
true || true = true
true || false = true
!true = false
 */
public class Comparison2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 真かつ真の答えは真
		System.out.println("true && true = " + (true && true));

		// 真かつ偽の答えは偽
		System.out.println("true && false = " + (true && true));

		// 真または真の答えは真
		System.out.println("true || true = " + (true && false));

		// 真または偽の答えは真
		System.out.println("true || false = " + (true && false));
		
		// 真を否定すると偽
		System.out.println("!true = " + (!true));

	}
}
