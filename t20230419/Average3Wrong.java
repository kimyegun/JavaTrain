package t20230419;

import java.util.Scanner;

public class Average3Wrong {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x값 :"); int x = stdIn.nextInt();
		System.out.print("y값 :"); int y = stdIn.nextInt();
		System.out.print("z값 :"); int z = stdIn.nextInt();
		
		double ave = (x + y + z) / 3.0;
		System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave);

	}

}
