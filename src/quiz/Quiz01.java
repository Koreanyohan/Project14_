/*
 *  다음 코드를 실행하면 에러가 발생합니다.
 *  프로그램이 정상적으로 종료되도록 예외를 처리하세요.
 * */

package quiz;

public class Quiz01 {

	public static void main(String[] args) {		

		try {
			int num = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
