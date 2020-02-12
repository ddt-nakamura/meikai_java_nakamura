package section02;
/**
 * 三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_02 {
	public static void main(String[] args) {
		//number1をint型にする
		int number1 ;
		//number2をint型にする
		int number2 ;
		//number3をint型にする
		int number3 ;
		
		//number1に10を代入する
		number1 =10;
		//number2に20を代入する
		number2 =20;
		//number3に30を代入する
		number3 =30;
		
		//number1~3に代入した数を全て足し算し出力する。　(合計は60です。と出力される)
		System.out.println("合計は" + (number1 + number2 + number3 ) + "です。");
		//number1~3に代入した数を全て足し算し÷3で平均をだし出力する。　(平均は20です。と出力される)
		System.out.println("平均は" + (number1 + number2 + number3 ) /3 + "です。");
	}
}
