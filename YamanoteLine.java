package game;

import java.util.Scanner;

public class YamanoteLine {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);

		System.out.println("----- �R����Q�[�� -----");
		System.out.println("��������n�߂ĊO���œ����遨�P ����聨�Q");
		int i = sc1.nextInt();
		if (i == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("��������n�߂ĊO���œ�����");
			final String[] kanji = { "����", "�L�y��", "�V��", "�l����", "�c��", "�i��", "���", "�ܔ��c", "�ڍ�", "�b���", "�a�J", "���h", "��X��",
					"�V�h", "�V��v��", "���c�n��", "�ڔ�", "�r��", "���", "����", "�", "�c�[", "�����闢", "���闢", "��J", "���", "��k��", "�H�t��",
					"�_�c" };

			final String[] kana = { "�Ƃ����傤", "�䂤�炭���傤", "����΂�", "�͂܂܂��傤", "���܂�", "���Ȃ���", "��������", "������", "�߂���", "���т�",
					"���Ԃ�", "�͂炶�キ", "��悬", "���񂶂キ", "���񂨂�����", "�������̂΂�", "�߂���", "�����Ԃ���", "������", "������", "���܂���", "���΂�",
					"�ɂ��ɂ��ۂ�", "�ɂ��ۂ�", "������������", "������", "�������܂�", "�����͂΂�", "����" };

			final String[] english = { "tokyo", "yurakucho", "shimbashi", "hamamatsucho", "tamachi", "shinagawa",
					"osaki", "gotanda", "meguro", "ebisu", "shibuya", "harajuku", "yoyogi", "shinjuku", "shin-okubo",
					"takadanobaba", "mejiro", "ikebukuro", "otsuka", "sugamo", "komagome", "tabata", "nishi-nippori",
					"nippori", "uguisudani", "ueno", "okachimachi", "akihabara", "kanda" };

			boolean check[] = new boolean[kanji.length]; // �񓚂����w�̃`�F�b�N�p�z��
			String stAns[] = new String[kanji.length]; // �񓚂��L�^���Ă����z��
			check[0] = true; // �J�n�O�ɓ����������������Ƃɂ��A�`�F�b�N������
			stAns[0] = kanji[0]; // �J�n�O�ɓ����������������Ƃɂ��A������L�^���Ă���
			int n = 1; // �񓚐���1�ɂ��Ă���
			int pos = 1; // �����𓚂����̂Ŏ��̓����͂��ׂ̗̉w����

			System.out.println("�����Ď��̉w������͂��Ă�������");
			loop1:
			while (n != kanji.length) {
				for (String st : stAns) {
					// ���ݓ������Ƃ���܂ł�\��
					if (st != null)
						System.out.print(st + "��");
				}
				String stName = sc.next();
				if (stName.equals(kanji[pos]) && !check[pos]) {

					stAns[pos] = stName;
					n++;
					pos += 1;
				} else {
					if (stName.equals(kana[pos]) && !check[pos]) {
						stAns[pos] = stName;
						n++;
						pos += 1;
					} else {
						if (stName.equals(english[pos]) && !check[pos]) {
							stAns[pos] = stName;
							n++;
							pos += 1;
						} else {
							if (stName.equals("end") | stName.equals("�I��") | stName.equals("���イ��傤")) {
								break loop1;
							} else {
								System.out.print("�~�@��");
							}
						}
					}
				}

				
			}
			System.out.println("�����l�ł���");
	
		} else {
			Scanner sc = new Scanner(System.in);
			System.out.println("��������n�߂ē����œ�����");
			final String[] kanji = { "����", "�L�y��", "�V��", "�l����", "�c��", "�i��", "���", "�ܔ��c", "�ڍ�", "�b���", "�a�J", "���h", "��X��",
					"�V�h", "�V��v��", "���c�n��", "�ڔ�", "�r��", "���", "����", "�", "�c�[", "�����闢", "���闢", "��J", "���", "��k��", "�H�t��",
					"�_�c" };

			final String[] kana = { "�Ƃ����傤", "�䂤�炭���傤", "����΂�", "�͂܂܂��傤", "���܂�", "���Ȃ���", "��������", "������", "�߂���", "���т�",
					"���Ԃ�", "�͂炶�キ", "��悬", "���񂶂キ", "���񂨂�����", "�������̂΂�", "�߂���", "�����Ԃ���", "������", "������", "���܂���", "���΂�",
					"�ɂ��ɂ��ۂ�", "�ɂ��ۂ�", "������������", "������", "�������܂�", "�����͂΂�", "����" };

			final String[] english = { "tokyo", "yurakucho", "shimbashi", "hamamatsucho", "tamachi", "shinagawa",
					"osaki", "gotanda", "meguro", "ebisu", "shibuya", "harajuku", "yoyogi", "shinjuku", "shin-okubo",
					"takadanobaba", "mejiro", "ikebukuro", "otsuka", "sugamo", "komagome", "tabata", "nishi-nippori",
					"nippori", "uguisudani", "ueno", "okachimachi", "akihabara", "kanda" };

			boolean check[] = new boolean[kanji.length]; // �񓚂����w�̃`�F�b�N�p�z��
			String stAns[] = new String[kanji.length]; // �񓚂��L�^���Ă����z��
			check[28] = true; // �J�n�O�ɓ����������������Ƃɂ��A�`�F�b�N������
			stAns[28] = kanji[28]; // �J�n�O�ɓ����������������Ƃɂ��A������L�^���Ă���
			int n = 1; // �񓚐���1�ɂ��Ă���
			int pos = 27; // �����𓚂����̂Ŏ��̓����͂��ׂ̗̉w����

			System.out.println("�����Ď��̉w������͂��Ă�������");
			loop2:
			while (n != kanji.length) {
				for (String st : stAns) {
					// ���ݓ������Ƃ���܂ł�\��
					if (st != null)
						System.out.print(st + "��");
				}
				String stName = sc.next();
				if (stName.equals(kanji[pos]) && !check[pos]) {

					stAns[pos] = stName;
					n++;
					pos -= 1;
				} else {
					if (stName.equals(kana[pos]) && !check[pos]) {
						stAns[pos] = stName;
						n++;
						pos -= 1;
					} else {
						if (stName.equals(english[pos]) && !check[pos]) {
							stAns[pos] = stName;
							n++;
							pos -= 1;
						} else {
							if (stName.equals("end") | stName.equals("�I��") | stName.equals("���イ��傤")) {
								break loop2;
							} else {
								System.out.print("�~�@��");
							}
						}
					}
				}

				
			
			}
			System.out.println("�����l�ł���");
		}
		sc1.close();
	}
}
