// 양의 정숫값을 읽어 자릿수를 표시한다.
package t20230414;
import java.util.Scanner;
public class DigitNo {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		do {
			System.out.println("양의 정숫값:");
			x= stdIn.nextInt();
		} while (x <=0);
		
		int digit=0; //자릿수
		while (x > 0) {
			digit++;	// 자릿수를 증가
			x /=10;		// x를 10으로 나눔
		}
		System.out.println("입력한 숫자는" + digit + "자리입니다.");
	}
}
