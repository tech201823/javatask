package chatbot;

import java.util.Scanner;

public class Chatbot {
	public static void main(String[] args) {
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		String botName = "�l�H�X�p�Q�b�e�B"; // �l�H�X�p�Q�b�e�B�̖��O
		String botView = "�y" + botName + "�z�F"; // �l�H�X�p�Q�b�e�B�̖��O�\���p
		String msg = ""; // ���̓f�[�^�̕ۑ��p
		System.out.println(botView + "���̖��O�� " + botName + " �ł��B\n" + "�u���v�ɑ����Ęb�������������e����͂��ĉ������B");
		// ��b����(�u�����v�Ɠ��͂����܂ŌJ��Ԃ�)
		int i = 0;
		System.out.print("�Ȃ܂����́�");
		String msg1 = "";
		msg1 = sc.next();
		do {
			System.out.print(msg1 + "�b��������(�I���F�����)��");
			msg = sc.next();
			// ���͂��ꂽ������ɑΉ�����ChatBot�̏���

			System.out.println("���񂿂�");
			switch (msg) {
			case "����ɂ���":
				System.out.print("���܂͖�ł�");
				break;
			case "����΂��":
				System.out.print("���܂͒��ł�");
				break;
			case "���͂悤�������܂�":
				System.out.print("���{��킩��Ȃ��ł��B");
				break;
			}
			i += 1;
			// switch�ɂ�鑽��������
			switch (msg) {
			case "END":
				b = false;
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
		System.out.println("��b��" + i);
		// �v���O�����̏I������
		System.out.println(botName + "�̋@�\���~���܂����B");
		sc.close();
	}
}