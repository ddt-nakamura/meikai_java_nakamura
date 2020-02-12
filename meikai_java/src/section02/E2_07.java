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
		//Randomクラスを生成する
		Random rand = new Random();
	
		//RandomNumber1をint型にし、キーボードで入力した文字をコンソール画面に出力
		int RandomNumber1 = rand.nextInt(9) ;
		
		//RandomNumber2をint型にし、キーボードで入力した文字をコンソール画面に出力
		int RandomNumber2 = rand.nextInt(90); 
	
		//正の数値が1以上、9以下の値をランダムにコンソール画面に出力する
		System.out.println((RandomNumber1 + 1 ) + "は1桁の正の整数です。");
		//負の数値が-1以上、-9以下の値をランダムにコンソール画面に出力する
		System.out.println((RandomNumber1 -9 ) + "は1桁の負の整数です。");
		//正の数値が10以上、99以下の値をランダムにコンソール画面に出力する
		System.out.println((RandomNumber2 + 10 ) + "は2桁の正の整数です。");
	}
}
