package mon10;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * コンピューターが選ぶ文字はランダムに選択されるため、以下と同じデータになるとは限りません。
 * なお、以下の出力結果内にある [ ] で囲まれた範囲は、実行中にキーボードから
 * 任意のデータを入力することを意味します。
 * 実行後にデータを入力し、正解の場合と不正解の場合の動作を確認してください。
 * 
 * ----- 期待される出力結果
 * --- 正解の場合
コンピューターの選んだ文字を予想して入力してください＞[d]
正解！
コンピューターが選んだ文字は[ d ]でした。

 * --- 不正解の場合
コンピューターの選んだ文字を予想して入力してください＞[d]
残念！
コンピューターが選んだ文字は[ v ]でした。
*/
import java.util.Random;
import java.util.Scanner;

public class RndChar {
	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		
		int start = 'a';
		int size = 'z' - start;
		int ans;
		char myans = '0';
		
		ans = rnd.nextInt(size) + start;
		// デバッグ用コード
		// System.out.println((char)ans);
		
		System.out.print("コンピューターの選んだ文字を予想して入力してください＞");
		sc.next().charAt(0);
		
		if (ans == myans) {
			System.out.println("正解！");
		} else {
			System.out.println("残念！");
		}
		System.out.println("コンピューターが選んだ文字は[ " + ans + " ]でした。");

		sc.close();
	}
}
