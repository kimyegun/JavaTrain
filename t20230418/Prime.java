//소수판정
package t20230418;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2이상의 정숫값:");
			n = stdIn.nextInt();
		} while (n < 2);
		
		int i;
		for (i = 2; i < n; i++)
			if (n % i == 0)
				break;
		if (i==n)
			System.out.println("소수입니다.");
		else
			System.out.println("소수가 아닙니다.");
	}
}
