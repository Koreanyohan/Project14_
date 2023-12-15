package main;

public class Ex03 {

	public static void main(String[] args) {
		try { // 여기서 에러 발생 안하면 밑에 catch문 무시하고 지나감.
			int[] arr = new int[5];
			arr[5] = 5;

		} catch (ArrayIndexOutOfBoundsException e) { // 발생 예외 매개변수로 들어감
					// ㄴ cf) 모든 예외의 최고 조사인 Exception클래스 넣으면 모든 예외잡음.
			System.out.println(e);  // 에러메시지 출력
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
