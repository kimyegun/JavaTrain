// 3개의 정수 중 최솟값 구하기
package t20230413;

import java.util.Scanner;

public class Min3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a:"); int a = stdIn.nextInt();
		System.out.print("정수 b:"); int b = stdIn.nextInt();
		System.out.print("정수 b:"); int c = stdIn.nextInt();
		
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		System.out.println("최솟값은" + min + "입니다.");

	}

}
