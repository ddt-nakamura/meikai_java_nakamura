package section02;
/**
 * 三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_02 {
	public static void main(String[] args) {
		//number_1をint型にする
		int number_1 ;
		//number_2をint型にする
		int number_2 ;
		//number_3をint型にする
		int number_3 ;
		
		//number_1に10を代入する
		number_1 =10;
		//number_2に20を代入する
		number_2 =20;
		//number_3に30を代入する
		number_3 =30;
		
		//number1~3に代入した数を全て足し算し出力する。　(合計は60です。と出力される)
		System.out.println("合計は" + (number_1 + number_2 + number_3 ) + "です。");
		//number1~3に代入した数を全て足し算し÷3で平均をだし出力する。　(平均はx20です。と出力される)
		System.out.println("平均は" + (number_1 + number_2 + number_3 ) /3 + "です。");
	}
}
