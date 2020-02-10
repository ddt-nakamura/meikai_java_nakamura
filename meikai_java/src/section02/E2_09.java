package section02;

import java.util.Random;

/**
 * 
 * 以下に示すプログラムを作成せよ。（実数値の乱数の生成にはnextDouble()を使うこと。）
 *・0.0以上1.0未満の実数値をランダムに生成して表示。
 *・0.0以上10.0未満の実数値をランダムに生成して表示。
 *・-1.0以上1.0未満の実数値をランダムの生成して表示。
 * 
 * @author nakamurayuka
 * @since  202000210
 */
public class E2_09 {

	public static void main(String[] args) {
		Random rand = new Random();
		double Random_number1 = rand.nextDouble(); //0.0以上1.0未満の実数値をランダム
		double Random_number2 = rand.nextDouble(); //0.0以上10.0未満の実数値をランダム

		System.out.println((Random_number1 + 0.9 ) + "は0.0以上1.0未満の実数値です。");
		System.out.println((Random_number1 + 9 ) + "は0.0以上10.0未満の実数値です。");
		System.out.println((Random_number2 -0.9 ) +  "は-1.0以上1.0未満の実数値です。");
		
	}

}
