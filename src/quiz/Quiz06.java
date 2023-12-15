package quiz;

public class Quiz06 {

	public static void main(String[] args) {


		try {
			Book book = new Book();			
		} catch (NoClassDefFoundError e) {
			System.out.println(e); 	
			e.printStackTrace();			
		}
	}
}

class Book {
	
}
