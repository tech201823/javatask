//package�w��A����̓N���X�������Ă�ꏊ�ɂ�邪���i�K�ł͋C�ɂ��Ȃ��Ă悢�i�ȗ��j
package chatbot;

import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		// true.false������ϐ�b��boolean���g���ėp��
		// �ϐ�b�ɂ͂����̃��[�`���i�u���b�N�j�ŏ����ɍ����Ƃ�false������̂ŁAtrue�ł�����Ă���
		// �� true�ł͂Ȃ�false����Ă����Ɩ������ŏI�����Ă��܂�����
		boolean b = true;
		// �ǂݎ��֐��̗p��
		Scanner sc = new Scanner(System.in);
		// ���O�̕ύX
		String botName = "�l�H�X�p�Q�b�e�B"; // chatbot�̖��O
		// ���O�̕\��
		String botView = "�y" + botName + "�z�F";
		String msg = ""; // ���̓f�[�^�̕ۑ��p
		System.out.println(botView + "���̖��O�� " + botName + " �ł��B\n" + "�u���v�ɑ����Ęb�������������e����͂��ĉ������B");
		// ��b����(�u�����v�Ɠ��͂����܂ŌJ��Ԃ�)
		// ��b�񐔂𐔂��邽�߂ɗp�ӂ����ϐ�i��������
		int i = 0;
		System.out.print("�Ȃ܂����́�");
		// ���͂��ꂽ���O��ϐ��ɓ���邽�߂ɕϐ��p��
		String msg1 = "";
		// �X�L���i�[�p��
		msg1 = sc.next();
		do {
			System.out.print(msg1 + "�b��������(�I���F�����)��");
			msg = sc.next();
			// ���͂��ꂽ������ɑΉ�����ChatBot�̏���

			System.out.println("���񂿂�");
			// switch�ɂ�鑽�������
			// �C���v�b�g�������A�ɑ΂���Ԏ���case�ŕ�����
			switch (msg) {
			case "����ɂ���":
				// case�ō��������͈̂ȉ��ŕ�����\��
				System.out.print("���܂͖�ł�");
				break;
			case "����΂��":
				System.out.print("���܂͒��ł�");
				break;
			case "���͂悤�������܂�":
				System.out.print("���{��킩��Ȃ��ł��B");
				break;
			}
			// ��b�񐔂���񂲂Ƃɉ��Z
			i += 1;
			// switch�ɂ�鑽��������
			// �����̏�����case�ŋL�q
			switch (msg) {
			case "END":
				b = false;
				// break�������case�̏����ɍ�������u���b�N�𔲂���
				break;
			case "�I���":
				b = false;
				break;
			case "End":
				b = false;
				break;
			case "�����":
				b = false;
				break;
			case "�I��":
				b = false;
				break;
			case "owari":
				b = false;
				break;
			default:
				b = true;
				break;
			}

		} while (b); // msg�̒l���u�����v�łȂ����do����J�Ԃ�
		// ��b�񐔂�i��\��
		System.out.println("��b��" + i);
		// �v���O�����̏I������
		System.out.println(botName + "�̋@�\���~���܂����B");
		sc.close();
	}
}