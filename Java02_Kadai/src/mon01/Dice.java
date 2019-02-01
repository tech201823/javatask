package mon01;
/*
 * 問題のある部分を修正し、以下のように出力してください。
 * 
 * 
 * ----- 期待される出力結果
エンターキーを押すとサイコロを振ります。(終了は他のキーを押してエンター)
出たサイコロの目は　5 です。

エンターキーを押すとサイコロを振ります。
出たサイコロの目は　2 です。

エンターキーを押すとサイコロを振ります。
出たサイコロの目は　4 です。
 */
import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.io.IOException;

public class Dice {
    public static void main(String[] A00) {
        int L00 = (int)(1 + Math.random() * 6);
        final int KEY_ENTER = 13;
    }
    	throws IOException {
        while (System.in.read() == KEY_ENTER) {
        System.out.printf("出たサイコロの目は " + L00 + " です。\n");
        System.in.read();
	}
	System.out.println("終了");
    	}
    	
    
}
    

