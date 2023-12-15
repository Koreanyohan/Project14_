/*
 * 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
 * */

package quiz;

public class Quiz03 {

	public static void main(String[] args) {
		Object obj = new Integer (0); 	
		
		try {
			String str = (String) obj;	
		} catch (ClassCastException e) {
			System.out.println(e);
			e.printStackTrace();
			
		}
	}
}
