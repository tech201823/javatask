package chatbot;

import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		String botName = "人工スパゲッティ"; // 人工スパゲッティの名前
		String botView = "【" + botName + "】："; // 人工スパゲッティの名前表示用
		String msg = ""; // 入力データの保存用
		System.out.println(botView + "私の名前は " + botName + " です。\n" + "「＞」に続けて話しかけたい内容を入力して下さい。");
		// 会話処理(「おわり」と入力されるまで繰り返す)
		int i = 0;
		System.out.print("なまえ入力＞");
		String msg1 = "";
		msg1 = sc.next();
		do {
			System.out.print(msg1 + "話しかける(終了：おわり)＞");
			msg = sc.next();
			// 入力された文字列に対応するChatBotの処理

			System.out.println("こんちわ");
			switch (msg) {
			case "こんにちは":
				System.out.print("いまは夜です");
				break;
			case "こんばんわ":
				System.out.print("いまは朝です");
				break;
			case "おはようございます":
				System.out.print("日本語わからないです。");
				break;
			}
			i += 1;
			// switchによる多条件分岐
			switch (msg) {
			case "END":
				b = false;
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
		System.out.println("会話回数" + i);
		// プログラムの終了処理
		System.out.println(botName + "の機能を停止しました。");
		sc.close();
	}
}