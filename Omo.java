import java.util.Random;

public class Omo {

	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		// 単語データ
		String[] word = { "船橋情報ビジネス専門学校", "情報ネットワーク科", "歩く筆箱", "Java", "プログラム", "究極", "絶対的", "空前絶後", "超絶怒涛",
				"スパイラルモデル", };
		String theme = "0";
		String select = "0";
		String select2 = "0";
		while (theme.equals(select)) {
			while (select.equals(select2)) {
				theme = word[rnd.nextInt(10) + 1];
				select = word[rnd.nextInt(10) + 1];
				select2 = word[rnd.nextInt(10) + 1];
			}
		}

		String result = "";
		result = theme + select + select2;
		// 結果を表示
		System.out.println(result);

		System.out.println("すべての組み合わせ");

		String sctheme = "0";
		String scselect = "0";
		String scselect2 = "0";

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i == j) {
						if (j == k) {
							System.out.println("！！！重複なので表示せず！！！");
						} else {
							sctheme = word[i];
							scselect = word[j];
							scselect2 = word[k];
							result = sctheme + scselect + scselect2;
							System.out.println(result);
						}
					}

				}
			}
		}
	}

}
