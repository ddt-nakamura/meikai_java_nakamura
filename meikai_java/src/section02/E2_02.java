package section02;
/**
 * 三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_02 {
	public static void main(String[] args) {
		int number_1 ;
		int number_2 ;
		int number_3 ;
		number_1 =10;
		number_2 =20;
		number_3 =30;
		System.out.println("合計は" + (number_1 + number_2 + number_3 ) + "です。");
		System.out.println("平均は" + (number_1 + number_2 + number_3 ) /3 + "です。");
	}
}
