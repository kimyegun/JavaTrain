package t20230412;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("변수 a:"); int a = stdin.nextInt();
		System.out.print("변수 b:"); int b = stdin.nextInt();
		
		if (a > b)
			System.out.println("a가 크다.");
		else if (a<b)
			System.out.println("b가 크다");
		else
			System.out.println("a와 b가 크다.");

	}

}
