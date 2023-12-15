package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		// 스트림 변수 선언
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다.");

			int i = 0 / 0;  // 이거 주석처리 해도 finally 문 실행됨

			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) { // 이 예외 발생해도닫고 싶을때 (fis.close())
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException a) {
				a.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다.");
		}
	}

}
