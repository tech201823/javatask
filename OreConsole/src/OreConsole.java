import java.util.Scanner;

public class OreConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hostname = "Router"; // ホスト名
		String prompt = ">"; // プロンプト
		String cmd = null; // コマンドを一時保存する変数

		while (true) { // 無限ループ
			System.out.print(hostname + prompt + " ");
			cmd = sc.nextLine();
			if (cmd.equalsIgnoreCase("hostname")) {
				hostname = sc.nextLine();

			} else {

				if (cmd.equalsIgnoreCase("enable") || cmd.equalsIgnoreCase("exit")) {
					if (cmd.equalsIgnoreCase("enable")) { // enableコマンドの処理
						if (prompt.equals(">")) { // ユーザ権限なら
							prompt = "#"; // 特権モードに変更
						} else if (prompt.equals("#")) { // 特権モードなら
							prompt = "神"; // 神に変更
						} else { // それ以外の時は神を超越
							System.out.println("神を超越して何になろうというのです。");
						}
					}
					
					if (cmd.equalsIgnoreCase("exit")) {
						if (prompt.equals("#")) { // プロンプトが特権モードを表現していたら
							prompt = ">"; // プロンプトをユーザモードにする
						} else if (prompt.equals(">")) {
							System.out.println("俺様コンソールから脱しました。");
							sc.close();
						} else if (prompt.equals("神")) {
							prompt = "#"; // 特権モードに変更

						}
					}
				} else {
					System.out.println("未知のコマンド");
				}
			}
		}
	}
}
