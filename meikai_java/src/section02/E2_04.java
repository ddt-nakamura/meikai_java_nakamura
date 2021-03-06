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
		
		// 入力されたデータをinputNumberに代入する
		int inputNumber = scn.nextInt();
		
		//キーボードから読み込んだ整数値に＋10を加えて出力
		System.out.println( "10を加えた値は" + (inputNumber +10) + "です。" );
		//キーボードから読み込んだ整数値に-10を加えて出力
		System.out.println( "10を減じた値は" + (inputNumber -10) + "です。" );
	}
}
