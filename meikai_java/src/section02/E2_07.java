package section02;

import java.util.Random;

/**
 * 
 * 以下に示すプログラムを作成せよ。 
 * ・１桁の正の整数値(すなわち1以上9以下の値)をランダムに生成して表示。
 * ・１桁の負の整数値(すなわち-9以上-1以下の値)をランダムに生成して表示。
 * ・2桁の正の整数値(すなわち10以上99以下の値)をランダムに生成して表示。
 * 
 * @author nakamurayuka
 * @since 202000210
 */
public class E2_07 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int Random_number1 = rand.nextInt(9) ;
		
		
		int Random_number2 = rand.nextInt(90); 
	
		//正の数値が1以上、9以下の値をランダムに出力
		System.out.println((Random_number1 + 1 ) + "は1桁の正の整数です。");
		//負の数値が-1以上、-9以下の値をランダムに出力
		System.out.println((Random_number1 -9 ) + "は1桁の負の整数です。");
		
		System.out.println((Random_number2 + 10 ) + "は2桁の正の整数です。");

	}
}
