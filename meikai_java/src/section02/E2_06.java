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
		// 入力されたデータをinput_numberに代入する
		double input_number = stdIn.nextDouble();
		
		System.out.println("三角形の面積を求めます。");

		System.out.print( "底辺:" );
		double base = stdIn.nextDouble();

		System.out.print( "高さ:" );
		double height = stdIn.nextDouble();

		System.out.println("面積は" + base * height /2 + "です。");
	}

}
