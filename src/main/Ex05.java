package main;

// 최상위 클래스 Exception 사용하기.

public class Ex05 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		try { // try까지만 치고 컨트롤스페이스하면 catch문까지 나옴.
			int i = 1/0;
		} catch (ClassCastException e) { // 예외 이름 앞자리까지만치고 자동완성해라.
			System.out.println(e);
		} catch (ArithmeticException e) {
			// try문에서 예외발생시 위의 catch문에서 못잡아 내면 다음 catch문으로 넘어옴
			System.out.println(e);
		} catch (Exception e) { // 부모타입 Exception에 자식의 인스턴스 저장 가능. 객체형변환.
			System.out.println(e);
		} // catch문 여러개 쓸때, 매개변수로 Exception쓸 경우, 해당 catch문은 가장 마지막에 두기.
		  // ㄴ 이 경우, Exception매개변수인 catch문을 앞에 둬버리면 에러남 

		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
