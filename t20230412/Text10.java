// 점수를 기준으로 성적 판정(방법1:논리곱 연산자&&를 이용)
package t20230412;

import java.util.Scanner;

public class Text10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("점수:");
		int point= stdIn.nextInt();
		
		if (point >=0 && point <= 49)
			System.out.println("가");
		else if (point >=50 && point <= 59)
			System.out.println("양");
		else if (point >=60 && point <=69)
			System.out.println("미");
		else if (point >=60 && point <=79)
			System.out.println("우");
		else if (point >=60 && point <=100)
			System.out.println("수");
		else
			System.out.println("잘못된 점수입니다.");

	}

}
