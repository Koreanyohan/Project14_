package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외처리 미루기
public class Ex08 {

	public static void main(String[] args) {		
		try {
			OpenTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void OpenTextFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}
}
