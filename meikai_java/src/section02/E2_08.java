package section02;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値を
 * ランダムに生成して表示するプログラムを作成せよ。
 * 
 * @author nakamurayuka
 * @since  202000210
 */

public class E2_08 {

	public static void main(String[] args) {
		 //コンソール画面にキーボードから数字を入力する
        Scanner stdIn = new Scanner(System.in);
        //Randomクラスを生成する
        Random rand  = new Random();
 
        //整数値という文字を出力します
        System.out.print("整数値：");
        //inputNumberをint型にする(整数値の入力)
        int inputNumber  = stdIn.nextInt();
        //randomNumberをint型にし、整数値に加えるための乱数を作成。(rand.nextInt(11); で生成される乱数0~10)
        int randomNumber = rand.nextInt(11);
 
        //生成された数値から5を引く
        randomNumber -= 5;
        //生成された数値と乱数0~10をたす
        inputNumber  += randomNumber;
        
        //カッコ内にある文字とinput_numberの乱数を出力します（
        System.out.println("その値の±5の乱数を生成しました。それは" + inputNumber + "です。");
	}

}
