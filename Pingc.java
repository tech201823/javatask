package pingc;

import java.util.Scanner;

public class Pingc {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("��萔����");
		Scanner sc = new Scanner(System.in);
		int i = sc1.nextInt();

		// ���̓f�[�^�̕��т��ȉ��̂悤�ɒ�߂�
		// ���,�I����1,�I����2,�I����3,�I����4,����ԍ�
		String[][] q = { { "�l�b�g���[�N�̓��ʊm�F�R�}���h�́H", "ping", "ping-t", "pong", "pong-t", "1" },
				{ "Hogehoge?", "foo", "bar", "foobar", "hogehoge", "4" },
				{ "����ɂ��́H", "���͂悤", "����ɂ���", "����΂��", "���悤�Ȃ�", "2" },
				{ "sg�����Ƃ́H", "�Z�J���h����", "�Z�L���A����", "�Z�L�����e�B�}�l�W�����g����", "�T�[�r�X����", "3" } };
		int[] scorein = { 15, 10, 10, 15 };

		int score = 0;
		int no = 0;
		int score2 = 0;
		// ���ƑI�����̕\��
		while (no < i) {
			int nofix = no + 1;
			System.out.println("�� " + nofix + " ��\n" + q[no][0]);
			for (int n = 1; n < q[no].length - 1; n++) {
				System.out.println(n + ": " + q[no][n]);
			}
			// �����̓���
			System.out.print("�����̔ԍ�����́�");
			String ans = sc.nextLine();
			// ���딻��
			if (q[no][5].equals(ans)) {
				System.out.println("�����I");
				score = score + 1;
				score2 = scorein[no] + score2;
			} else {
				System.out.println("�s�����I");
			}
			// ���ԍ���1��������
			no++;
			System.out.println();
		}
		System.out.println("���𐔁F" + score + "��/" + i + "��");
		float ans2 = score;
		ans2 = ans2 / i;
		ans2 = ans2 * 100;
		System.out.println("���𗦁F" + ans2 + "%");
		System.out.println("���_" + score2 + "�_");
		sc.close();
		sc1.close();
	}
}