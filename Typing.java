import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class Typing {
	public static void main(String[] args) throws IOException {
		int ten = 0;
		int type=0;
		String i;
		int j=0;
		Random rnd = new Random(System.currentTimeMillis());
		Scanner sc = new Scanner(System.in);
		String[] word = { "hello", "java", "world","test","good"};
		long begin = 0L, end = 0L;
		System.out.println("Enter�L�[�ŊJ�n���܂�");
		while (System.in.read() != '\n')
			;
		System.out.println("----- ----- Begin! ----- -----");
		begin = System.currentTimeMillis();
		System.out.println("���P����K���܂����H");
		int k = sc.nextInt();

		do {
			int number = rnd.nextInt(3);
			System.out.print(word[number] + "\n> ");
			String input = sc.next();
			if (input.equals(word[number])) {
				System.out.println("����");
				ten = ten + 10;
				j=j+word[number].length();
			} else {
				System.out.println("�s����");
				j=j-word[number].length();
			}
			type=type+1;
		} while (type < k);
		end = System.currentTimeMillis();
		System.out.println("----- ----- End! ----- -----");
		System.out.println(((end - begin) / 1000.0) + "�b�ŏI�����܂���");
		System.out.println(ten + "�_�ł�");
		System.out.println("���𗦂�" + (ten/10/k * 100) + "%");
		System.out.println("�������ɂ��_����"+j);
		sc.close();
	}
}