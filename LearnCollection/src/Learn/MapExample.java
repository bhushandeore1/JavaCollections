package Learn;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> courses =new HashMap<>();
		courses.put("Core Java", 2000);
		courses.put("Python", 1000);
		courses.put("Spring", 1500);
		courses.put("Js", 3000);
		System.out.println(courses);
		
		System.out.println( courses.containsKey("Python"));
	}

}
