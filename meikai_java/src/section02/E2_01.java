package section02;
/**
 * List2-6の2の箇所を、小数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
 * @author nakamurayuka
 * @since 20190902
 */
public class E2_01 {

	public static void main(String[] args) {
		
		//number1をint型にする
		int number1 ;
		//number2をint型にする
		int number2 ;

		//number1に63.5を代入する。63.5は小数点でありdouble型のため、int型で宣言をすると型が不一致のためエラーになります
		number1 = 63.5 ;
		//number2に18.5を代入する。18.5は小数点でありdouble型のため、int型で宣言をすると型が不一致のためエラーになります
		number2 = 18.5 ;

		//number1に代入した数を出力　（number1の値は63.5です。と出力される）
		System.out.println("xの値は" + number1 + "です。");
		
		//number2に代入した数を出力　（number2の値は18.5です。と出力される）
		System.out.println("yの値は" + number2 + "です。"); 
		
		//number1とnumber2に代入した数を足し算し出力　(合計は82.0です。と出力される)
		System.out.println("合計は" + (number1 + number2) + "です。");
		//number1とnumber2に代入した数の平均を÷２して出力　(平均は41.0です。と出力される)
		System.out.println("平均は" + (number1 + number2) / 2 + "です。");
	}

}
