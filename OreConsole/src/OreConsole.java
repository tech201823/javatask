import java.util.Scanner;

public class OreConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hostname = "Router"; // �z�X�g��
		String prompt = ">"; // �v�����v�g
		String cmd = null; // �R�}���h���ꎞ�ۑ�����ϐ�

		while (true) { // �������[�v
			System.out.print(hostname + prompt + " ");
			cmd = sc.nextLine();
			if (cmd.equalsIgnoreCase("hostname")) {
				hostname = sc.nextLine();

			} else {

				if (cmd.equalsIgnoreCase("enable") || cmd.equalsIgnoreCase("exit")) {
					if (cmd.equalsIgnoreCase("enable")) { // enable�R�}���h�̏���
						if (prompt.equals(">")) { // ���[�U�����Ȃ�
							prompt = "#"; // �������[�h�ɕύX
						} else if (prompt.equals("#")) { // �������[�h�Ȃ�
							prompt = "�_"; // �_�ɕύX
						} else { // ����ȊO�̎��͐_�𒴉z
							System.out.println("�_�𒴉z���ĉ��ɂȂ낤�Ƃ����̂ł��B");
						}
					}
					
					if (cmd.equalsIgnoreCase("exit")) {
						if (prompt.equals("#")) { // �v�����v�g���������[�h��\�����Ă�����
							prompt = ">"; // �v�����v�g�����[�U���[�h�ɂ���
						} else if (prompt.equals(">")) {
							System.out.println("���l�R���\�[������E���܂����B");
							sc.close();
						} else if (prompt.equals("�_")) {
							prompt = "#"; // �������[�h�ɕύX

						}
					}
				} else {
					System.out.println("���m�̃R�}���h");
				}
			}
		}
	}
}
