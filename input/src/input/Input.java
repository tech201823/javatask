package input;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("–¼‘O>");
		String name = sc.next();
		System.out.print("”N—î>");
		int age = sc.nextInt();
		age =age-20;
		System.out.println("‚±‚ñ‚É‚¿‚Í"+name+"‚³‚ñ("+age+")");
		sc.close();
	}
}

/*
 puts "input name>"
 name = gets.to_s
 puts "input age>"
 age = gets.to_i
 puts "Your name is"+name+",age is"+age
 */