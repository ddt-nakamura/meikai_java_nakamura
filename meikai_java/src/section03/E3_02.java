package section03;

import java.util.Scanner;

/**
 * 二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です。」と表示し、
 * そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 * 
 * @author nakamurayuka
 * @since  20200219
 */
public class E3_02 {

	public static void main(String[] args) {
		//キーボードに入力された文字を出力する
        Scanner stdIn= new Scanner(System.in);
		
        //コンソール画面に「整数A:」を出力する
		System.out.print("整数A:");
		//number1をint型にする(整数値の入力)
        int number1  = stdIn.nextInt();
		
		//コンソール画面に「整数B:」を出力する
		System.out.print("整数B:");
		//number2をint型にする(整数値の入力)
        int number2  = stdIn.nextInt();
		
		//整数Bは整数Aの約数の場合
        if(number1 > number2) 
        	//整数Bは整数Aの約数の場合、コンソール画面に「BはAの約数です。」を出力する
    		System.out.println("BはAの約数です。");
        
        //整数Bは整数Aの約数ではない場合
        else if (number2 >= number1)
    	 //整数Bは整数Aの約数ではない場合、コンソール画面に「BはAの約数ではありません。」を出力する
        	System.out.println("BはAの約数ではありません。");
	}

}
