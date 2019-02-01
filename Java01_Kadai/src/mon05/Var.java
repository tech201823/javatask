package mon05;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * ----- 期待される出力結果
byte_val = 123
short_val = 12345
int_val = 12345
long_val = 12345
float_val = 12345.123
double_val = 12345.123456789
char_val = あ
string_val = あいうえおかきくけこ01234567890
boolean_val = true
 */
public class Var {
	public static void main(String[] args) {
		byte byte_val = 123;
		short short_val = 12345;
		int int_val = 12345;
		long long_val = 12345L;

		float float_val = (float) 12345.1234567890;
		double double_val = 12345.1234567890;
		
		char char_val = 'あ';
		String string_val = "あいうえおかきくけこ01234567890";

		boolean boolean_val = true;

		
		System.out.println("byte_val = " + byte_val);
		System.out.println("short_val = " + short_val);
		System.out.println("int_val = " + int_val);
		System.out.println("long_val = " + long_val);
		
		System.out.println("float_val = " + float_val);
		System.out.println("double_val = " + double_val);
				
		System.out.println("char_val = " + char_val);
		System.out.println("string_val = " + string_val);
		
		System.out.println("boolean_val = " + boolean_val);
	}
}
