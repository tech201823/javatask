package statement;

public class IfSamp {
	public static void main(String[] args) {
		boolean flag = false;
		int x = 0;
		flag = x < 10;
		if (flag) {
			System.out.println("������");
		} else if (x > 10) {
			System.out.println("2�ڂ̏�����������");
		} else {
			System.out.println("�������Ȃ�");
		}
	}
}
