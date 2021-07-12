package com.google.mhsgallery;

public class Test7 {
	public static void main(String [] args) {
		System.out.println("==Test7 Start==");
		int kor = 56;
		int eng = 65;
		int math = 49;
		int total = kor+eng+math;
		double avg = total / 3.0; // 3.0으로 하던지 둘 중 하나에 double을 붙이던지
		
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg); //56.66664
		
		avg = avg*100;
		System.out.println(avg);
		int result = (int)avg;
		System.out.println(result);
		avg = (double)result/100;
		
		kor=100;//56
		// total에게 바뀌라고 얘기 안했음 -> 안바뀜
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);//56.66
	}
	

}
