package section02;
import java.util.Scanner;
/**
 * キーボードから読み込んだ整数値に10を加えた値を減じた値を出力するプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_04 {
	public static void main(String[] args) {
		// スキャナークラスの中のメソッドを使えるようにする。
		Scanner scn = new Scanner(System.in);
		// 入力されたデータをinput_numberに代入する
		int input_number = scn.nextInt();
		System.out.println( "を加えた値は" + (input_number +10) + "です。" );
		System.out.println( "を減じた値は" + (input_number -10) + "です。" );
	}
}
