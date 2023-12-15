package main;

public class Ex04 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		try { // try까지만 치고 컨트롤스페이스하면 catch문까지 나옴.
			arr[5] = 5;
		} catch (ClassCastException e) { // 예외 이름 앞자리까지만치고 자동완성해라.
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) { 
					// try문에서 예외발생시 위의 catch문에서 못잡아 내면 다음 catch문으로 넘어옴
			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}

}
