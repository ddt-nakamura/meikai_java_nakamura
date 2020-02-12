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
        
        //「整数値:」をコンソール画面に出力
		System.out.print("整数値:");
		//文字列を読み込む
        int number1  = stdIn.nextInt();
        
        //もしnumber1が0より大きければtrueの処理を行う
        if(number1 < 0) {
        	//もしnumber1の値が-のとき、-がなくなるように-1にする、
        	number1 = number1*-1;
        }
        //trueのとき「その絶対値は5です。」をコンソール画面に出力
        System.out.println("その絶対値は" + number1 +"です。");
	}
}
