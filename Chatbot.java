//package指定、これはクラスが入ってる場所によるが現段階では気にしなくてよい（省略可）
package chatbot;

import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		// true.falseが入る変数bをbooleanを使って用意
		// 変数bにはしたのルーチン（ブロック）で条件に合うときfalseを入れるので、trueでも入れておく
		// ↑ trueではなくfalse入れておくと無条件で終了してしまうため
		boolean b = true;
		// 読み取り関数の用意
		Scanner sc = new Scanner(System.in);
		// 名前の変更
		String botName = "人工スパゲッティ"; // chatbotの名前
		// 名前の表示
		String botView = "【" + botName + "】：";
		String msg = ""; // 入力データの保存用
		System.out.println(botView + "私の名前は " + botName + " です。\n" + "「＞」に続けて話しかけたい内容を入力して下さい。");
		// 会話処理(「おわり」と入力されるまで繰り返す)
		// 会話回数を数えるために用意した変数iを初期化
		int i = 0;
		System.out.print("なまえ入力＞");
		// 入力された名前を変数に入れるために変数用意
		String msg1 = "";
		// スキャナー用意
		msg1 = sc.next();
		do {
			System.out.print(msg1 + "話しかける(終了：おわり)＞");
			msg = sc.next();
			// 入力された文字列に対応するChatBotの処理

			System.out.println("こんちわ");
			// switchによる多分岐条件
			// インプットした挨拶に対する返事をcaseで分ける
			switch (msg) {
			case "こんにちは":
				// caseで合ったものは以下で文字列表示
				System.out.print("いまは夜です");
				break;
			case "こんばんわ":
				System.out.print("いまは朝です");
				break;
			case "おはようございます":
				System.out.print("日本語わからないです。");
				break;
			}
			// 会話回数を一回ごとに加算
			i += 1;
			// switchによる多条件分岐
			// おわりの条件をcaseで記述
			switch (msg) {
			case "END":
				b = false;
				// breakをいれてcaseの条件に合ったらブロックを抜ける
				break;
			case "終わり":
				b = false;
				break;
			case "End":
				b = false;
				break;
			case "おわり":
				b = false;
				break;
			case "終了":
				b = false;
				break;
			case "owari":
				b = false;
				break;
			default:
				b = true;
				break;
			}

		} while (b); // msgの値が「おわり」でなければdoから繰返し
		// 会話回数のiを表示
		System.out.println("会話回数" + i);
		// プログラムの終了処理
		System.out.println(botName + "の機能を停止しました。");
		sc.close();
	}
}