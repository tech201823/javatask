package mon08;
/*
 * 問題のある部分を修正し、以下のようにメッセージを出力してください。
 * コードを短く出来る場合は短く修正してもよい。
 * 
 * ----- 期待される出力結果
1インチは2.54cmです。
13インチは33.02cmです。
15インチは38.1cmです。
 */
public class Convert {
	public static void main(String[] args) {
		float cm;
		cm = inchToCm(1);
		System.out.println("1インチは" + cm + "cmです。");

		cm = inchToCm(13);
		System.out.println("13インチは" + cm + "cmです。");
		
		cm = inchToCm(15);
		System.out.println("15インチは" + cm + "cmです。");
	}
	
	static float inchToCm(int inch) {
		return (float) (inch * 2.54);
	}
}
