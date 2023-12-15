package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		String s = null;	 
		
		try {
			System.out.println(s.length()); 
				// String의 인스턴스가 없는데도 String 객체의 메서드 사용하려함.
		} catch (NullPointerException e) {
			System.out.println("프로그램이 정상 종료됩니다.");
		}
	}
}
