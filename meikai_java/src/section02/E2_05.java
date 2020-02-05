package section02;
/**
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
import java.util.Scanner;

public class E2_05 {
		public static void main(String[] args) {
			// スキャナークラスの中のメソッドを使えるようにする。
			Scanner stdIn = new Scanner(System.in);
			// 入力されたデータをinput_numberに代入する
			double input_number = stdIn.nextDouble();
			
			System.out.print( "xの値:" );
			double x = stdIn.nextDouble();
			
			System.out.print( "yの値:" );
			double y = stdIn.nextDouble();

			System.out.println("合計は " + (x + y) + "です。");
			System.out.println("平均は " + (x + y) /2+ "です。");
		}
	}