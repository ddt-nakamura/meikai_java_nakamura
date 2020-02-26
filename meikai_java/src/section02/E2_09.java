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
		//Randomクラスを生成する
		Random rand = new Random();
		
		//実数値でのランダム作成する(0.0以上1.0未満の実数値をランダム)
		double RandomNumber1 = rand.nextDouble(); 
		//整数値で0~9のランダムを作成する（0.0以上10.0未満の実数値をランダム）
		double RandomNumber2 = rand.nextDouble(); 

		//0.0以上1.0未満を出力
		System.out.println((RandomNumber1 + 0.9 ) + "は0.0以上1.0未満の実数値です。");
		//0.0以上10.0未満を出力
		System.out.println((RandomNumber1 + 9 ) + "は0.0以上10.0未満の実数値です。");
		//-1.0以上1.0未満を出力
		System.out.println((RandomNumber2 -0.9 ) +  "は-1.0以上1.0未満の実数値です。");
		
	}

}
