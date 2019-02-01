package pingc;

import java.util.Scanner;

public class Pingc {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("問題数入力");
		Scanner sc = new Scanner(System.in);
		int i = sc1.nextInt();

		// 問題はデータの並びを以下のように定める
		// 問題,選択肢1,選択肢2,選択肢3,選択肢4,正解番号
		String[][] q = { { "ネットワークの導通確認コマンドは？", "ping", "ping-t", "pong", "pong-t", "1" },
				{ "Hogehoge?", "foo", "bar", "foobar", "hogehoge", "4" },
				{ "こんにちは？", "おはよう", "こんにちは", "こんばんは", "さようなら", "2" },
				{ "sg試験とは？", "セカンド試験", "セキュア試験", "セキュリティマネジメント試験", "サービス試験", "3" } };
		int[] scorein = { 15, 10, 10, 15 };

		int score = 0;
		int no = 0;
		int score2 = 0;
		// 問題と選択肢の表示
		while (no < i) {
			int nofix = no + 1;
			System.out.println("第 " + nofix + " 問\n" + q[no][0]);
			for (int n = 1; n < q[no].length - 1; n++) {
				System.out.println(n + ": " + q[no][n]);
			}
			// 答えの入力
			System.out.print("答えの番号を入力＞");
			String ans = sc.nextLine();
			// 正誤判定
			if (q[no][5].equals(ans)) {
				System.out.println("正解！");
				score = score + 1;
				score2 = scorein[no] + score2;
			} else {
				System.out.println("不正解！");
			}
			// 問題番号に1を加える
			no++;
			System.out.println();
		}
		System.out.println("正解数：" + score + "問/" + i + "問");
		float ans2 = score;
		ans2 = ans2 / i;
		ans2 = ans2 * 100;
		System.out.println("正解率：" + ans2 + "%");
		System.out.println("得点" + score2 + "点");
		sc.close();
		sc1.close();
	}
}