import java.util.Random;

public class Omo {

	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		// �P��f�[�^
		String[] word = { "�D�����r�W�l�X���w�Z", "���l�b�g���[�N��", "�����M��", "Java", "�v���O����", "����", "��ΓI", "��O���", "����{��",
				"�X�p�C�������f��", };
		String theme = "0";
		String select = "0";
		String select2 = "0";
		while (theme.equals(select)) {
			while (select.equals(select2)) {
				theme = word[rnd.nextInt(10) + 1];
				select = word[rnd.nextInt(10) + 1];
				select2 = word[rnd.nextInt(10) + 1];
			}
		}

		String result = "";
		result = theme + select + select2;
		// ���ʂ�\��
		System.out.println(result);

		System.out.println("���ׂĂ̑g�ݍ��킹");

		String sctheme = "0";
		String scselect = "0";
		String scselect2 = "0";

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if (i == j) {
						if (j == k) {
							System.out.println("�I�I�I�d���Ȃ̂ŕ\�������I�I�I");
						} else {
							sctheme = word[i];
							scselect = word[j];
							scselect2 = word[k];
							result = sctheme + scselect + scselect2;
							System.out.println(result);
						}
					}

				}
			}
		}
	}

}
