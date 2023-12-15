package main;

public class Ex02 {

	public static void main(String[] args) {

		int [] arr = new int[5];
		arr[5] = 5;		// ArrayIndexOutOfBounds예외 - 런타임에러라 실행했을때만 나옴
		
		System.out.println("프로그램이 정상 종료됩니다."); 
		// ㄴ 위의 런타임에러로 프로그램 종료되서 여기 실행 안됨.

	}
}
