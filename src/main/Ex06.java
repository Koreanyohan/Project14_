package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* 컴파일러가 예외를 체크해 주는 경우
 * */
// unchecked / checked 예외

public class Ex06 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}

		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
