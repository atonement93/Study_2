package com.google.mhsgallery;

public class Test8 {
	public static void main(String [] args) {
		System.out.println("==Test8 Start==");
		
		//물건값의 합계
		int price;
		//손님이 낸돈
		int money;
		//거스름돈
		int don;
		
		// 물건값의 합계보다 손님이 낸돈이 더 많다라는 가정 하에 거스름돈 계산
		// 1. 물건값의 합계, 손님이 낸돈, 거스름돈 각각 출력
		// 만원짜리 갯수를 담을 변수
		int man;
		// 천원짜리 갯수를 담을 변수
		int cheon;
		// 백원짜리 갯수를 담을 변수
		int back;
		// 십원짜리 갯수를 담을 변수
		int sip;
		
		price = 11110;
		money = 99760;
		don = money-price;
		System.out.println("Price = "+price);
		System.out.println("Money = "+money);
		System.out.println("거스름돈 = "+don);
		
		man = don/10000;
		System.out.println("만원 : "+man+ " 장");
		
		cheon = don/1000;
		cheon = cheon%10;
		//cheon = (don-(man*10000))/1000;
		//cheon = don%10000/1000;
		System.out.println("천원 : "+cheon+" 장");
		
		back = don/100;
		back = back%10;
		//back = (don-(man*10000)-(cheon*1000))/100;
		//back = don%1000/100;
		System.out.println("백원 : "+back+" 장");
		
		sip = don/10;
		sip = sip%10;
		//sip = don%100/10;
		System.out.println("십원 : "+sip+" 장");
		
		
	}
}
