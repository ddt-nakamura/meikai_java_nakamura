package section02;
/**
 * 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
import java.util.Scanner;

public class E2_05 {
		public static void main(String[] args) {
			// スキャナークラスの中のメソッドを使えるようにする。キーボードで入力した数字を出力する処理
			Scanner stdIn = new Scanner(System.in);
			
			//コンソールに「xの値:」と出力される。
			System.out.print( "xの値:" );
			//number1をdouble型にし、キーボードで入力した文字が出力される
			double number1 = stdIn.nextDouble();
			
			//コンソールに「yの値:」と出力される。
			System.out.print( "yの値:" );
			//number2をdouble型にし、キーボードで入力した文字が出力される
			double number2 = stdIn.nextDouble();

			//(number1の値に入力した数)と(number2の値に入力した数)を足し算しコンソール画面に出力する。
			System.out.println("合計は " + (number1 + number2) + "です。");
			//(number1の値に入力した数)と(number2の値に入力した数)を足し算し÷2でコンソール画面に出力する。
			System.out.println("平均は " + (number1 + number2) /2+ "です。");
		}
	}