package section02;

import java.util.Scanner;

/**
 * 右に示すように、名前の姓と名とを個別にキーボードから読み込んで、挨拶を行うプログラムを作成せよ。
 * @author nakamurayuka
 * @since  20200212
 */
public class E2_10 {

	public static void main(String[] args) {
		 //キーボードに入力された文字を出力する
        Scanner stdIn= new Scanner(System.in);
        
        //「姓:」をコンソール画面に出力する
        System.out.print("姓:");
        //文字列を読み込む
        String lastname  = stdIn.next();
       
        //「名前:」をコンソール画面に出力する
        System.out.print("名前:");
        //文字列を読み込む
        String name  = stdIn.next();
        
        //「こんにちは柴田望洋さん。」をコンソール画面に出力する
        System.out.println("こんにちは柴田望洋さん。");
	}

}
