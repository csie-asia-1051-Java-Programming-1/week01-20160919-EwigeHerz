package hw;
import java.util.*;
/*
* Topic:  請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 105021027 陳宴湘
 */

public class hw04_105021027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    float a = sc.nextFloat();
	    float b = sc.nextFloat();
	    
	    System.out.print( Math.pow(a,1/b));
	}

}
