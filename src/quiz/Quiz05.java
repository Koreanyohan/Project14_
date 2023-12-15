package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수를 입력하세요");
		
	//	"abc"를 입력해봐.
		try {
			int num = scanner.nextInt(); // String a = scanner.nextLine();써야  
		} catch (InputMismatchException e) {
			System.out.println("잘못 입력 하셨습니다. 정수를 입력하세요");
			e.printStackTrace();			
		}	
	}
}
