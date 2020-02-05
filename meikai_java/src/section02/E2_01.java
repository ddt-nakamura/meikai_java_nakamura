package section02;
/**
 * List2-6の2の箇所を、小数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
 * @author nakamurayuka
 * @since 20190902
 */
public class E2_01 {

	public static void main(String[] args) {
		double x ;
		double y ;
		//intは整数型でdoubleは小数型だから小数部の場合、double型になる。
		x = 63.5 ;
		y = 18.5 ;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。"); 
		System.out.println("合計は" + (x+y) + "です。");
		System.out.println("平均は" + (x+y) / 2 + "です。");
	}

}
