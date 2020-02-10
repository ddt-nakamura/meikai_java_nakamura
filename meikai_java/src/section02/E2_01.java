package section02;
/**
 * List2-6の2の箇所を、小数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
 * @author nakamurayuka
 * @since 20190902
 */
public class E2_01 {

	public static void main(String[] args) {
		
		//xをdouble型にする
		double x ;
		//yをdouble型にする
		double y ;

		//xに63.5を代入する。
		x = 63.5 ;
		//yに18.5を代入する。
		y = 18.5 ;

		//xに代入した数を出力　（xの値は63.5です。と出力される）
		System.out.println("xの値は" + x + "です。");
		
		//yに代入した数を出力　（yの値は18.5です。と出力される）
		System.out.println("yの値は" + y + "です。"); 
		
		//xとyに代入した数を足し算し出力　(合計は82.0です。と出力される)
		System.out.println("合計は" + (x+y) + "です。");
		//xとyに代入した数の平均を÷２してs出力　(平均は41.0です。と出力される)
		System.out.println("平均は" + (x+y) / 2 + "です。");
	}

}
