package statement;

public class IfSamp {
	public static void main(String[] args) {
		boolean flag = false;
		int x = 0;
		flag = x < 10;
		if (flag) {
			System.out.println("正しい");
		} else if (x > 10) {
			System.out.println("2つ目の条件が正しい");
		} else {
			System.out.println("正しくない");
		}
	}
}
