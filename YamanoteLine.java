package game;

import java.util.Scanner;

public class YamanoteLine {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("----- 山手線ゲーム -----");
		System.out.println("東京から始めて外回りで答える→１ 内回り→２");
		int i = sc1.nextInt();
		if (i == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("東京から始めて外回りで答える");
			final String[] kanji = { "東京", "有楽町", "新橋", "浜松町", "田町", "品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木",
					"新宿", "新大久保", "高田馬場", "目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原",
					"神田" };

			final String[] kana = { "とうきょう", "ゆうらくちょう", "しんばし", "はままつちょう", "たまち", "しながわ", "おおさき", "ごたんだ", "めぐろ", "えびす",
					"しぶや", "はらじゅく", "よよぎ", "しんじゅく", "しんおおくぼ", "たかだのばば", "めじろ", "いけぶくろ", "おおつか", "すがも", "こまごめ", "たばた",
					"にしにっぽり", "にっぽり", "うぐいすだに", "うえの", "おかちまち", "あきはばら", "かんだ" };

			final String[] english = { "tokyo", "yurakucho", "shimbashi", "hamamatsucho", "tamachi", "shinagawa",
					"osaki", "gotanda", "meguro", "ebisu", "shibuya", "harajuku", "yoyogi", "shinjuku", "shin-okubo",
					"takadanobaba", "mejiro", "ikebukuro", "otsuka", "sugamo", "komagome", "tabata", "nishi-nippori",
					"nippori", "uguisudani", "ueno", "okachimachi", "akihabara", "kanda" };

			boolean check[] = new boolean[kanji.length]; // 回答した駅のチェック用配列
			String stAns[] = new String[kanji.length]; // 回答を記録しておく配列
			check[0] = true; // 開始前に東京だけ答えたことにし、チェックを入れる
			stAns[0] = kanji[0]; // 開始前に東京だけ答えたことにし、それを記録しておく
			int n = 1; // 回答数を1にしておく
			int pos = 1; // 東京を答えたので次の答えはその隣の駅から

			System.out.println("続けて次の駅名を入力してください");
			loop1:
			while (n != kanji.length) {
				for (String st : stAns) {
					// 現在答えたところまでを表示
					if (st != null)
						System.out.print(st + "→");
				}
				String stName = sc.next();
				if (stName.equals(kanji[pos]) && !check[pos]) {

					stAns[pos] = stName;
					n++;
					pos += 1;
				} else {
					if (stName.equals(kana[pos]) && !check[pos]) {
						stAns[pos] = stName;
						n++;
						pos += 1;
					} else {
						if (stName.equals(english[pos]) && !check[pos]) {
							stAns[pos] = stName;
							n++;
							pos += 1;
						} else {
							if (stName.equals("end") | stName.equals("終了") | stName.equals("しゅうりょう")) {
								break loop1;
							} else {
								System.out.print("×　＞");
							}
						}
					}
				}

				
			}
			System.out.println("お疲れ様でした");
	
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("東京から始めて内回りで答える");
			final String[] kanji = { "東京", "有楽町", "新橋", "浜松町", "田町", "品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木",
					"新宿", "新大久保", "高田馬場", "目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原",
					"神田" };

			final String[] kana = { "とうきょう", "ゆうらくちょう", "しんばし", "はままつちょう", "たまち", "しながわ", "おおさき", "ごたんだ", "めぐろ", "えびす",
					"しぶや", "はらじゅく", "よよぎ", "しんじゅく", "しんおおくぼ", "たかだのばば", "めじろ", "いけぶくろ", "おおつか", "すがも", "こまごめ", "たばた",
					"にしにっぽり", "にっぽり", "うぐいすだに", "うえの", "おかちまち", "あきはばら", "かんだ" };

			final String[] english = { "tokyo", "yurakucho", "shimbashi", "hamamatsucho", "tamachi", "shinagawa",
					"osaki", "gotanda", "meguro", "ebisu", "shibuya", "harajuku", "yoyogi", "shinjuku", "shin-okubo",
					"takadanobaba", "mejiro", "ikebukuro", "otsuka", "sugamo", "komagome", "tabata", "nishi-nippori",
					"nippori", "uguisudani", "ueno", "okachimachi", "akihabara", "kanda" };

			boolean check[] = new boolean[kanji.length]; // 回答した駅のチェック用配列
			String stAns[] = new String[kanji.length]; // 回答を記録しておく配列
			check[28] = true; // 開始前に東京だけ答えたことにし、チェックを入れる
			stAns[28] = kanji[28]; // 開始前に東京だけ答えたことにし、それを記録しておく
			int n = 1; // 回答数を1にしておく
			int pos = 27; // 東京を答えたので次の答えはその隣の駅から

			System.out.println("続けて次の駅名を入力してください");
			loop2:
			while (n != kanji.length) {
				for (String st : stAns) {
					// 現在答えたところまでを表示
					if (st != null)
						System.out.print(st + "→");
				}
				String stName = sc.next();
				if (stName.equals(kanji[pos]) && !check[pos]) {

					stAns[pos] = stName;
					n++;
					pos -= 1;
				} else {
					if (stName.equals(kana[pos]) && !check[pos]) {
						stAns[pos] = stName;
						n++;
						pos -= 1;
					} else {
						if (stName.equals(english[pos]) && !check[pos]) {
							stAns[pos] = stName;
							n++;
							pos -= 1;
						} else {
							if (stName.equals("end") | stName.equals("終了") | stName.equals("しゅうりょう")) {
								break loop2;
							} else {
								System.out.print("×　＞");
							}
						}
					}
				}

				
			
			}
			System.out.println("お疲れ様でした");
		}
		sc1.close();
	}
}
