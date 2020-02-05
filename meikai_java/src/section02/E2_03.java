package section02;

//Scannerクラスを使いたいので、ここにインポートする。
import java.util.Scanner;

/**
 * キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。
 * @author nakamurayuka
 * @since 202000205
 */
public class E2_03 {
	public static void main(String[] args) {
		// スキャナークラスの中のメソッドを使えるようにする。
		Scanner scn = new Scanner(System.in);
		// 入力されたデータをinput_numberに代入する
		int input_number = scn.nextInt();
		System.out.println(input_number + "と入力しましたね。" );
	}
}