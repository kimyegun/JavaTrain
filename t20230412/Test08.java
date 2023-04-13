// 읽은 정숫값이 양수이면 10의 배수인지 판정해서 표시
package t20230412;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("정숫값:");
		int n = stdin.nextInt();
		
		if(n>0)
			if(n%10 ==0)
				System.out.println("이 값은 10의 배수입니다.");
			else
				System.out.println("이 값은 10의 배수가 아닙니다.");
		else
			System.out.println("음의 정숫값을 입력했습니다.");

	}

}
