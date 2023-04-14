// 숫자 맞추기 게임
package t20230414;

import java.util.Random;
import java.util.Scanner;

public class Number2digis {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		int no = 10 + rand.nextInt(90); // 맞춰야 하는 숫자:10~99난수 생성
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요");
		int x;			// 읽는 값
		do {
			System.out.print("어떤 숫자일까?:");
			x = stdIn.nextInt();
			
			if(x > no)
				System.out.println("더 작은 숫자입니다.");
			else if (x < no)
				System.out.println("더 큰 숫자입니다.");
		// 정답이 아니면 반복한다
		} while (x !=no);
		System.out.print("정답입니다.");
	}

}
