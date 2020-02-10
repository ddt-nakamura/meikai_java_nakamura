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
		
		// 入力されたデータをinput_numberに代入
		int input_number = scn.nextInt();
		//キーボードから数字を入力すると入力した数字が出力され後ろに「と入力しましたね。」と出力される。
		System.out.println(input_number + "と入力しましたね。" );
	}
}