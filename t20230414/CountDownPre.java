package t20230414;

import java.util.Scanner;

public class CountDownPre {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int x;
		do {
			System.out.print("양의 정숫값:");
			x = stdIn.nextInt();
		} while (x <=0);
		
		while (x >=0)
			System.out.println(--x);						// x값을 표시한 후 감소시킴
		System.out.println("x의 값이" + x + "이 됐습니다.");		// x값 표시
	}

}
