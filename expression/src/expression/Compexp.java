package expression;

public class Compexp {
	public static void main(String[] args) {
		//1<2 result
		System.out.println("1<2"+(1<2));
		//1��2�����ł���=true
		System.out.println("1>2"+(1>2));
		//A��B�ȏ�
		System.out.println("1>=2="+(1>=2));
		//A��B�Ƃ͈قȂ�
		System.out.println("1!=2="+(1!=2));
		//�����f�[�^��r
		System.out.println("a<z="+('a'<'z'));
		//������f�[�^�̔�r
		System.out.println("���ე�@"=="���ე�@");
		String s = "���ე�@";
		System.out.println(s=="���ე�@");
		//�m���Ă�̂ňȉ��ȗ�
		//���_�a�@||
		//���_�ρ@&&
		
	}
}
