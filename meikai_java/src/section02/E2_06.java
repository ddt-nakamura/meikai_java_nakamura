package section02;

import java.util.Scanner;
/**
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_06 {

	public static void main(String[] args) {
		// スキャナークラスの中のメソッドを使えるようにする。
		Scanner stdIn = new Scanner(System.in);
		
		//コンソール画面に「三角形の面積を求めます。」と出力する
		System.out.println("三角形の面積を求めます。");

		//コンソール画面に「底辺:」と出力する
		System.out.print( "底辺:" );
		//baseをdouble型にし、キーボードで入力した文字が出力される
		double base = stdIn.nextDouble();

		//コンソール画面に「高さ:」と出力する
		System.out.print( "高さ:" );
		//heightをdouble型にし、キーボードで入力した文字が出力される
		double height = stdIn.nextDouble();

		//(baseの値に入力した数)と(heightの値に入力した数)を足し算し÷2を行いコンソール画面に出力する。
		System.out.println("面積は" + base * height /2 + "です。");
	}

}
