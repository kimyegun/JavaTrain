// 읽은 정숫값이 양수이면 3으로 나눈 결과를 표시
package t20230412;

import java.util.Scanner;

public class text09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = stdIn.nextInt();
		
		if(n > 0)
			if (n%3 ==0)
				System.out.println("이 값은 3으로 나누어집니다.");
			else if (n%3 ==1)
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
			else
				System.out.println("이 값을 3으로 나눈 나머지는 2입니다.");
		else
			System.out.println("이 값은 양수가 아닙니다.");

	}

}
