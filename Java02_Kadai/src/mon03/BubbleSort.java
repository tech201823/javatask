package mon03;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * ----- 期待される出力結果
並び替え前
5 6 2 9 13 21 1 4 7 7 

並び替え後
1 2 4 5 6 7 7 9 13 21 
*/
public class BubbleSort {
	public static void main(String[] args) {
		int[] src = { 5, 6, 2, 9, 13, 21, 1, 4, 7, 7 };

		System.out.println("並び替え前");
		for (int val : src) {
			System.out.print(val + " ");
		}
		
		for (int i = 0; i < src.length; i++) {
			for (int j = src.length - 1; j > i; j--) {
				if (src[j] < src[j-1]) {
					int w = src[j];
					src[j] = src[j-1];
					src[j-1] = w;
				}
			}
		}
		
		System.out.println("\n\n並び替え後");
		for (int val : src) {
			System.out.print(val + " ");
		}
	}
}
