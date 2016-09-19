package ex;
import java.util.Scanner;
 /*
* Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (a = b*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021027 陳宴湘
 */

public class ex01_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      float a = sc.nextFloat();
      float b = 0;
      b = (a-32)*5/9;
      
      System.out.print(b);
      
		
		 
		  
	}

}
