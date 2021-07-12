package com.google.mhsgallery;

import java.util.Scanner;

public class Test10 {
	public static void main(String [] args) {
		System.out.println("==Test10 Start==");
		// 0 -> 0
		// 1 -> 1
		// 2 -> 2
		// 4 -> 10
		// 5 -> 11
		// 6 -> 12
		// 7 -> 13
		// 8 -> 20
		
		// 규칙 4, 10
		// 변수 - 변하는 수
		// 변수 선언부터
		// java는 필요할 때 변수 선언 가능(꼭 처음이 아니라 중간에서도 선언 가능)
		
		// 실행 중에 데이터를 키보드로부터 입력받을 준비
		Scanner sc/*변수*/ = new/*예약어*/ Scanner(System.in);
		
		
		int input=5;
		int output=0; // 5일때 11 나와야

		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();

		
		output = input/4*10+input%4;
		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
		
	}
}
