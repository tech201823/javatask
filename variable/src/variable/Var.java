package variable;

public class Var {
	public static void main(String[] args) {
		//�ϐ�
		//�f�[�^���������ɕۑ�����d�g��
		//�ϐ��̏���
		//�^�ϐ���
		int ask;
		ask = 20000;
		System.out.println(ask);
	}

}

/*
# json�Ăяo��
require "json"

# json�t�@�C�����Ȃ��Ƃ��ɍ쐬����t�@�C���ɏ������ޔz��쐬
arrf = Array.new

# �t�@�C�������݂��Ă邩�m�F����Ȃ�I��false�ɕϊ����̌�A�J��Ԃ����g��10�̒l����������
if !(File.exist?("attend.json"))
  # jsonwrite
  File.open("attend.json", "w") do |file|
    i = 0
    until i > 10
      arrf[i] = 0
      i = i + 1
    end
    str = JSON.dump(arrf, file)
  end
end

# �z��^�̗p��
arr = Array.new

# jsonload
File.open("attend.json") do |file|
  arr = JSON.load(file)
end

# �o��
puts "���ƃR�[�h��ł�����ł�������"
puts "0:web���K�@1:Java�@2:IT�p�X�|�[�g 3:Cisco 4:LHR 5:office���K "
puts "6:�R���s���[�^�[�V�X�e�� 7:�A�E�u�� 8:����΍� 9:�r�W�l�X����"
puts "10:�A���S���Y��"

# ���ƃR�[�h�Q�b�g
n = gets.to_i

# �s���Ȕԍ�����ꂽ�Ƃ��ɃG���[���o��
until n >= 0 && n <= 10
  puts "���������ƃR�[�h�����Ă�������"
  n = gets.to_i
end
# ���Ɩ��Ǘ�
arrj = Array.new
arrj = ["0:web���K", "1:Java", "2:IT�p�X�|�[�g", "3:Cisco", "4:LHR", "5:office���K", "6:�R���s���[�^�[�V�X�e��", "7:�A�E�u��", "8:����΍�", "9:�r�W�l�X����", "10:�A���S���Y��"]

# �x�񂾉񐔓���
puts "�x�񂾉񐔂���́i1��Ȃ�1,�x�񂾉񐔂����炵�����Ȃ�-1�j=>>>"
y = gets.to_i

# �s���Ȕԍ�����ꂽ�Ƃ��ɃG���[���o��
until y >= -30 && y <= 30
  puts "���������������Ă�������"
  y = gets.to_i
end

#arr��nil�Ȃ�Ύ��̃��[�`���ŉ��Z�ł��Ȃ��̂�0������
if arr[n].nil?
  arr[n] = 0
end
# �z��ɋx�񂾉񐔂����Z
arr[n] = arr[n] + y

# jsonwrite
File.open("attend.json", "w") do |file|
  arr1 = arr
  str = JSON.dump(arr1, file)
end

# ���͌㏑������json���ēǍ����邽�߂ɔz��p��
larr2 = Array.new

#�@jsonload
File.open("attend.json") do |file|
  larr2 = JSON.load(file)
end

# i�̏�����
i = 0

# arr��nil�Ȃ��0�����ďo�͂��J��Ԃ�
until i >= 11
  if arr[i].nil?
    arr[i] = 0
  end
  print arrj[i]
  print "=>"
  puts larr2[i]
  i = i + 1
end

*/