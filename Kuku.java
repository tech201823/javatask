
//���v�Z
//���͗p��
import java.util.Scanner;

public class Kuku {
	public static void main(String[] args) {
		// ���͗p��
		Scanner sc = new Scanner(System.in);
		// �������鐔�Ƃ������鐔��p��
		int i, j, k;
		i = 1;
		j = 1;
		k = 1;
		//�\��������
		System.out.print("���i�܂ŕ\�������܂���==>");
		//������
		k = sc.nextInt();
		//�����s
		System.out.print("\r\n");

		// ���i�̌J��Ԃ��J�n
		while (i <= k) {
			System.out.print(i + "�̒i��|");
			// ���|���Z�J�n
			while (j <= 9) {
				// ���\������2���ɂ��邽�߂ɃJ�b�R�̒��ɂ��낢����ꂽ2���ɖ����Ȃ��Ƃ���01�݂�����0�����ĕ\��
				// ���Ȃ�ł���Ń[�������̂��킩��Ȃ����l�b�g�ŏE�����A���������炦�����
				System.out.print(String.format("%02d", i * j) + "|");
				// �������鐔�𑝂₷���߂�1���Z
				j += 1;
			}
			// ����i���\���ォ���鐔j��������
			j = 1;
			// ���i�̐��𑫂�
			i += 1;
			// ���i�����s
			System.out.print("\r\n");
			// ���i����؂�o�[�̕\�������邽�߂ɕϐ��p��
			int var;
			var = 0;
			// ���i�̋�؂�o�[�i�A���_�[�o�[�i_�j�j��33��J��Ԃ��\��������
			while (var <= 4 * k) {
				System.out.print("_");
				// ���o�[��33��\���������烋�[�v�𔲂��邽�߂ɂǂ�ǂ�1�����Ă���
				var += 1;
			}
			// ���o�[��33��\������������s�R�[�h�ŉ��s
			// �v���O�����N�������s������@���킩��Ȃ��̂Ŗ�����������A����͂��Ă��Ȃ��B
			System.out.print("\r\n");
			// ���i�̌J��Ԃ��I���̃J�b�R
		}
	}
}
