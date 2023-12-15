package quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Quiz07 {

	public static void main(String[] args) {
		// 숫자 목록 생성
		Set<Integer> set = new HashSet<>();
		set.add(1); // == set.add(new Integer(1));
		set.add(2);
		set.add(3);

		try {
			Iterator<Integer> it = set.iterator();
			int num1 = it.next(); // 1을 num1에 저장
			int num2 = it.next(); // 2을 num2에 저장
			int num3 = it.next(); // 3을 num3에 저장
			int num4 = it.next(); // set.get(4)를 num4에 저장 - 없어 

		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
}
