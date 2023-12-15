package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * Ex07에 있는거 finally문 사용함
 * */
public class Ex07_1 {

	public static void main(String[] args) {
		// 스트림 변수 선언
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다.");

			int i = 0 / 0;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) { // 이 예외 발생해도닫고 싶을때 (fis.close())
			e.printStackTrace();
		} finally { // try - catch문 둘 다에 들어가는거 여기에 적으면 공통
			if (fis != null) {// 파일 없어서 catch (FileNotFoundException e)갈 경우 대비
				try {
					fis.close();
				} catch (IOException a) {
					a.printStackTrace();
				}
				System.out.println("사용한 리소스를 닫았습니다.");
			}
		}

	}
}
