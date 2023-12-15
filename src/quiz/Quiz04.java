/*
 * 다음 코드를 실행하면 에러가 발생합니다.
 * 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
 * */

package quiz;

public class Quiz04 {

	public static void main(String[] args) {
		String str = "1.23";
		
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) { // 실수를 정수로 변경하려고해서 에러남 
			System.out.println(e);
			e.printStackTrace();
			System.out.println("예외 메시지" + e.getMessage());
		}
	}

}
