import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���O����==>>");
		String name = sc.next(); // ���O
		int maxhp = 10, hp = maxhp; // �ő�̗�, �̗�
		int day = 1; // �o�ߓ���
		int cmd = 0; // �I�����ꂽ���j���[�ԍ�
		while (cmd != 9 && hp > 0) { // �I�����I�΂�ĂȂ��̗͂�0�ȏ�Ȃ犈���ł���
			// ���j���[��\������
			System.out.println("--- " + day + "���� " + name + "�̍s�����j���[");
			System.out.println("�̗�: " + hp + "/" + maxhp);
			System.out.println("[1] �^�� [2]�׋� [3]���� [9]�I��");
			System.out.print("�ԍ�����͂��Ă�������: ");
			// ��O����
			try {
				cmd = sc.nextInt(); // �ԍ�(�����l)�̓��͏���
				//��O�̎��̏���
			} catch (NumberFormatException e) {
				System.out.println("***�@���������Ȃ��łˁ@***");
			} catch (InputMismatchException e) {
				System.out.println("***�@���������Ȃ��łˁ@***");
				//��O�����I�����K���s������
			} finally {
				//��O�����͕ϐ��ł͂Ȃ��o�b�t�@�ōs���̂Ńo�b�t�@������
				sc.nextLine(); // sc�o�b�t�@���o���ď�����
				//�悭�킩��Ȃ����Ǖϐ������܂��Ȃ��ŏ�����
				cmd = 0;
			}
			//hp��8�ȏ�̎��͐Q���Ȃ�����
			if (hp > 8 && cmd == 3) {
				System.out.println("***�@�x�݂����Ă���ȏ�x�߂Ȃ��@***");
			} else {
				switch (cmd) { // �ȉ�switch�̃u���b�N���͊e�R�}���h�̏���
				case 1: // �^��
					System.out.println("*** �^�����܂��� ***");
					hp = hp - 2;
					break;
				case 2: // �׋�
					System.out.println("*** �׋����܂��� ***");
					hp = hp - 2;
				case 9: // �I��
					break;
				case 3:
					System.out.println("*** �������܂��� ***");
					hp = hp + 2;
					break;
				default: // ���̑�
					System.out.println("���̔ԍ��̓��j���[�ɂ���܂���B");
					day--;
					break;
				}
			}
			day++; // �R�}���h1��ɂ�1��������
			System.out.println(); // �󔒍s�����A�����Ƃ̋�؂�Ɏg��
		}
		if (hp <= 0)
			System.out.println(name + "��" + day + "���ڂɗ͐s�����B");
		sc.close();
	}
}
