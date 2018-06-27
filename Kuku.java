
//九九計算
//入力用意
import java.util.Scanner;

public class Kuku {
	public static void main(String[] args) {
		// 入力用意
		Scanner sc = new Scanner(System.in);
		// ↓かける数とかけられる数を用意
		int i, j, k;
		i = 1;
		j = 1;
		k = 1;
		//表示させる
		System.out.print("何段まで表示させますか==>");
		//↓入力
		k = sc.nextInt();
		//↓改行
		System.out.print("\r\n");

		// ↓段の繰り返し開始
		while (i <= k) {
			System.out.print(i + "の段は|");
			// ↓掛け算開始
			while (j <= 9) {
				// ↓表示桁を2桁にするためにカッコの中にいろいろ入れた2桁に満たないときは01みたいに0をつけて表示
				// ↓なんでこれでゼロがつくのかわからないがネットで拾った、動いたからええやん
				System.out.print(String.format("%02d", i * j) + "|");
				// ↓かける数を増やすために1加算
				j += 1;
			}
			// ↓一段分表示後かける数jを初期化
			j = 1;
			// ↓段の数を足す
			i += 1;
			// ↓段を改行
			System.out.print("\r\n");
			// ↓段を区切るバーの表示をするために変数用意
			int var;
			var = 0;
			// ↓段の区切りバー（アンダーバー（_））を33回繰り返し表示させる
			while (var <= 4 * k) {
				System.out.print("_");
				// ↓バーを33回表示させたらループを抜けるためにどんどん1足していく
				var += 1;
			}
			// ↓バーを33回表示させたら改行コードで改行
			// プログラム起動中改行する方法がわからないので無理やりやった、後悔はしていない。
			System.out.print("\r\n");
			// ↓段の繰り返し終了のカッコ
		}
	}
}
