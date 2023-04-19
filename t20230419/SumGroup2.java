package t20230419;

import java.util.Scanner;

public class SumGroup2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		int total = 0;
		
		Outer:
			for (int i = 1; i <=10 ; i++) {
				System.out.println(i+"그룹");
				
				for (int j = 0; j < 5; j++) {
					System.out.print("정수:");
					int t = stdIn.nextInt();
					if (t == 99999)
						break Outer;
					else if (t == 88888)
						continue Outer;
					total += t;
				}
			}
		System.out.println("\n합계는" + total + "입니다.");

	}

}
