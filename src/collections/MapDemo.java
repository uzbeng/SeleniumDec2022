package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.devtools.v104.layertree.model.StickyPositionConstraint;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> studentScore = new HashMap<String, Integer>();
		
		studentScore.clear();
		studentScore.put("Bob", 55);
		studentScore.put("Alex", 67);
		studentScore.put("Anna", 78);
		
		int bobsScore = studentScore.get("Bob");
		System.out.println(bobsScore);
		
		System.out.println(studentScore.containsKey("Anna"));
		System.out.println(studentScore.containsValue(55));
		
		studentScore.isEmpty();
		
		Set<String> students = studentScore.keySet();
		System.out.println(students);
		
		studentScore.remove("Alex");
		studentScore.replace("Anna", 88);
		System.out.println(studentScore);
		System.out.println(studentScore.size());
		

	}

}
