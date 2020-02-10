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
        Scanner stdIn = new Scanner(System.in); //キーボードから数字を入力
        Random rand  = new Random();
 
        System.out.print("整数値：");
        int input_number  = stdIn.nextInt();
        int random_number = rand.nextInt(11);
 
        input_number  += random_number;
        random_number -= 5;
        
        System.out.println("その値の±5の乱数を生成しました。それは" + input_number + "です。");
	}

}
