package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 105021027 陳宴湘
 */

public class ex03_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.print( Math.pow(a,b));
	    
	    
		
	}

}
