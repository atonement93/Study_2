package com.google.mhsgallery;

public class Test6 {
	public static void main(String [] args) {
		System.out.println("==Test6 Start==");
		
		// 5 int
		// 3.12 double
		// 5+3.12 = 8.12 double
		int num=5;
		double num2 = 3.12;
		num=(int)(num+num2);
		System.out.println("Num : "+num);
		
		//국영수 - 0 - 100
		int kor = 63;
		int eng = 35;
		int math = 53;
		// 총점을 계산해서 총점 출력
		int total = kor+eng+math;
		System.out.println("Total : "+total);
		// 평균을 계산해서 평균 출력
		
		// double average = (double)(total/3);
		double average = total/(double)3;
		System.out.println("Average : "+average);
		

		
	
		
	}

}
