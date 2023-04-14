// 읽은 개수만큼 *와 +를 교대로 표시(방법1)
package t20230414;
import java.util.Scanner;
public class PutAsteriskAlt1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요?:");
		int n = stdIn.nextInt();
		if (n > 0) {
			int i=0;
			while(i < n) {
				if(i % 2 ==0)		//i가 짝수이면 '*'를 출력
					System.out.print('*');
				else				//i가 홀수이면 '*'를 출력
					System.out.print('*');
				i++;
			}
			System.out.println();
		}
	}
}
