package hw;
import java.util.*;
/*
* Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021027 陳宴湘
 */

public class hw03_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      float a1 = sc.nextFloat();
      Math.round(a1);
      float a2 = sc.nextFloat();
      Math.round(a2);
      float a3 = sc.nextFloat();
      Math.round(a3);
      float a4 = sc.nextFloat();
      Math.round(a4);
      float a5 = sc.nextFloat();
      Math.round(a5);
      float a6 = sc.nextFloat();
      Math.round(a6);
      float b1 = Math.min(a1,a2);
      float b2 = Math.min(b1,a3);
      float b3 = Math.min(b2,a4);
      float b4 = Math.min(b3,a4);
      float b5 = Math.min(b4,a5);
      float b6 = Math.min(b5,a6);
      System.out.print(b6);
     
      
	}

}
