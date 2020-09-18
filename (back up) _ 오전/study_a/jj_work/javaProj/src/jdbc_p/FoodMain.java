package jdbc_p;

public class FoodMain {

	public static void main(String[] args) {
		
		FoodDTO dto = new FoodDTO("aaa");
		
		new FoodDAO().insertOne(dto);
		
		System.out.println(dto);

	}

}
