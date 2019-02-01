import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("名前入力==>>");
		String name = sc.next(); // 名前
		int maxhp = 10, hp = maxhp; // 最大体力, 体力
		int day = 1; // 経過日数
		int cmd = 0; // 選択されたメニュー番号
		while (cmd != 9 && hp > 0) { // 終了が選ばれてなく体力が0以上なら活動できる
			// メニューを表示する
			System.out.println("--- " + day + "日目 " + name + "の行動メニュー");
			System.out.println("体力: " + hp + "/" + maxhp);
			System.out.println("[1] 運動 [2]勉強 [3]睡眠 [9]終了");
			System.out.print("番号を入力してください: ");
			// 例外処理
			try {
				cmd = sc.nextInt(); // 番号(整数値)の入力処理
				//例外の時の処理
			} catch (NumberFormatException e) {
				System.out.println("***　文字列入れないでね　***");
			} catch (InputMismatchException e) {
				System.out.println("***　文字列入れないでね　***");
				//例外処理終了時必ず行う処理
			} finally {
				//例外処理は変数ではなくバッファで行うのでバッファ初期化
				sc.nextLine(); // scバッファ取り出して初期化
				//よくわからないけど変数もおまじないで初期化
				cmd = 0;
			}
			//hpが8以上の時は寝られなくする
			if (hp > 8 && cmd == 3) {
				System.out.println("***　休みすぎてこれ以上休めない　***");
			} else {
				switch (cmd) { // 以下switchのブロック内は各コマンドの処理
				case 1: // 運動
					System.out.println("*** 運動しました ***");
					hp = hp - 2;
					break;
				case 2: // 勉強
					System.out.println("*** 勉強しました ***");
					hp = hp - 2;
				case 9: // 終了
					break;
				case 3:
					System.out.println("*** 睡眠しました ***");
					hp = hp + 2;
					break;
				default: // その他
					System.out.println("その番号はメニューにありません。");
					day--;
					break;
				}
			}
			day++; // コマンド1回につき1日増える
			System.out.println(); // 空白行を作り、翌日との区切りに使う
		}
		if (hp <= 0)
			System.out.println(name + "は" + day + "日目に力尽きた。");
		sc.close();
	}
}
