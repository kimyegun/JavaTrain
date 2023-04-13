//읽은 두 값의 차가 11이상인지를 표시(방법2:조건 연산문)
package t20230413;

import java.util.Scanner;

public class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a= stdIn.nextInt();
		System.out.print("정수 b:"); int b= stdIn.nextInt();
		
		int diff = a >= b ? a -b : b -a;
		System.out.println("두 값의 차는" + 
		(diff <= 10 ? "10이하" : "11이상") +"입니다.");

	}

}
