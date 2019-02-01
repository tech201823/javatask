package metjod3;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Method3 {
	final static Scanner sc = new Scanner(System.in);
	final static int INT_MIN = -1000;
	final static int INT_MAX = 1000;
	public static void main(String[] args) {

	int x,y;
		do {
	System.out.println("次のxとyに整数値を入力してください。");
	try {
	x = input("x=", INT_MIN, INT_MAX);
	y = input("y=", INT_MIN, INT_MAX);
	}catch(InputMismatchException e) {
		System.out.println("int error");
		x=0;
		y=0;
	}
	if(y==0||x==0) {
		System.out.println("不定形or発散エラー再入力");
		if(y==0&&x!=0) {
			System.out.println("この値は発散します");
		}
	}
	

		}while(y==0||x==0);
	
	int iRet;
		
	System.out.println(x+"+"+y);
	iRet = add(x, y); resultPut("+", x, y, iRet); // 足し算
	System.out.println(x+"-"+y);
	iRet = sub(x, y); resultPut("-", x, y, iRet); // 引き算
	System.out.println(x+"*"+y);
	iRet = mul(x, y); resultPut("*", x, y, iRet); // 掛け算
	System.out.println(x+"/"+y);
	iRet = div(x, y); resultPut("/", x, y, iRet); // 割り算
	}
	
	// 入力メソッド
	static <sc> int input(String msg, int min, int max) {
	int val = 0;
	do {
	System.out.println("入力範囲: " + min + "～" + max);
	System.out.print(msg);
	try {
	val = sc.nextInt();
	} catch (InputMismatchException e) {
	sc.nextLine();
	}
	} while(val < min || val > max);
	return val;
	}
	// 式と結果の表示をするメソッド
	static void resultPut(String m, int x, int y, int r) {
	System.out.println(r);
	}
	// 足し算のメソッド
	static int add(int x, int y) {
	return x + y;
	}
	// 引き算のメソッド
	static int sub(int x, int y) {
	return x-y;
	}
	static int mul(int x, int y) {
		return x*y;
		}
	static int div(int x, int y) {
		return x/y;
		}
}
