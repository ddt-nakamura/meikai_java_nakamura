package section03;

import java.util.Scanner;
/**
 * 右に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
 * @author nakamurayuka
 * @since  20200212
 */
public class E3_01 {

	public static void main(String[] args) {
		//キーボードに入力された文字を出力する
        Scanner stdIn= new Scanner(System.in);
        //コンソール画面に「整数値:」を出力
        System.out.print("整数値:");
   
        //integerをint型にする(整数値の入力)
        int integer  = stdIn.nextInt();
        //integerは0より小さいかの条件を作成
        
        //もしintegerが0より小さい場合
        if (integer < 0) {
        	//integerが0より小さければtrue判定、入力した値が「-」だった場合、変数名に-して「-」を除去する
        	integer = - integer;
        }
       	//コンソール画面に「その絶対値は○○です。」と出力。（○○はinteger（変数名）の値を出力。）
       	System.out.println("その絶対値は" + integer + "です。");
	}

}
