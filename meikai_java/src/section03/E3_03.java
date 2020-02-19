package section03;

import java.util.Scanner;

/**
 * List3-5の最後のelseを、else if(n == 0)に変更したらどうなるかを検討せよ。
 * @author nakamurayuka
 * @since  20200219
 */

public class E3_03 {

	public static void main(String[] args) {
		//キーボードに入力された文字を出力する
        Scanner stdIn= new Scanner(System.in);

        //コンソール画面に「整数値:」を出力
        System.out.print("整数値:");
        //number1をint型にする(整数値の入力)
        int number1 = stdIn.nextInt();
        
        //もしnumber1が0より大きい場合
        if(number1 > 0)
        	//number1が0より大きい場合、「その値は正です。」と出力する
        	System.out.println("その値は正です。");
        
        //「number1>0」がfalseの場合「number1は0より小さい」の条件式を行う
        else if(number1 < 0)
        	//number1が0より小さい場合、「その値は正です。」と出力する。
        	System.out.println("その値は負です。");
        
        //elseだと上記の計算式が当てはまらない場合、 (number1 == 0)の条件式がtrueの場合「その値は0です。」を出力
        //else ifにした場合、「number1>0」がfalseの場合「number1は0と等しい」の条件式を行う
        else if (number1 == 0)
        	//number2と0が等しい場合、「その値は0です。」と出力する。
        	System.out.println("その値は0です。");
	}

}
