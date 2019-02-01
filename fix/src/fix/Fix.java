package fix;
import java.io.*;
public class Fix {
	public static void main(String[] args) throws IOException{
		
	//入力の準備
		BufferedReader br =
	new BufferedReader(new InputStreamReader(System.in));
		
	String kisuu ="奇数計: sum(";
	String guusu ="偶数計: sum(";
	
	int kisuu_sum = 0;
	int guusu_sum = 0;
	
	System.out.println("msg: 入力した値が奇数か偶数かを判定してそれぞれの足し算を行います");
	
	
	
int seisu;
		
do { System.out.println("msg: input 整数(終了:99)>");
	 seisu = Integer.parseInt(br.readLine());
		
		
		int amari = seisu%2;
		if(amari == 0) {
			//System.out.println(seisu + "は偶数です。");
			guusu +=seisu +",";
			guusu_sum +=seisu;
			
		}else {
			kisuu +=seisu +",";
			kisuu_sum +=seisu;
			
		}

		
		
	
}while(seisu!=99);
	
System.out.println("奇数"+kisuu_sum);
System.out.println("偶数"+guusu_sum);

	}
}
