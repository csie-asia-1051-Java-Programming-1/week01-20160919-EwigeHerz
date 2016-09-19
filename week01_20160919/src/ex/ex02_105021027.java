package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤a"，轉換成 "磅b" (1磅b = 0.45359 公斤a)
 * Date: 2016/09/19
 * Author: 105021027 陳宴湘
 */
public class ex02_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      float a = sc.nextFloat();
	      float b = 0;
	      b = a*100000/45359;
	      
	      System.out.print(b);
	      
	}

}
