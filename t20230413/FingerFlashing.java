// 생성된 난수에 따라 가위바위보 중 하나를 표시
package t20230413;

import java.util.Random;

public class FingerFlashing {

	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("컴퓨터가 낸 것:");
		int hand = rand.nextInt(3);   // 0~2 사이의 난수
		
		switch(hand)  {
		case 0: System.out.println("가위");  break;
		case 1: System.out.println("바위");  break;
		case 2: System.out.println("보");  break;
		
		}

	}

}
