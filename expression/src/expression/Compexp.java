package expression;

public class Compexp {
	public static void main(String[] args) {
		//1<2 result
		System.out.println("1<2"+(1<2));
		//1は2未満である=true
		System.out.println("1>2"+(1>2));
		//AはB以上
		System.out.println("1>=2="+(1>=2));
		//AはBとは異なる
		System.out.println("1!=2="+(1!=2));
		//文字データ比較
		System.out.println("a<z="+('a'<'z'));
		//文字列データの比較
		System.out.println("じゃヴァ"=="じゃヴァ");
		String s = "じゃヴァ";
		System.out.println(s=="じゃヴァ");
		//知ってるので以下省略
		//理論和　||
		//理論積　&&
		
	}
}
