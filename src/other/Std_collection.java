package other;

import java.util.HashMap;
import java.util.Map;

public class Std_collection {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(2, "j");
		m1.put(3, "z");
		m1.put(1, "a");

		for(Map.Entry<Integer, String> entry : m1.entrySet())
			System.out.println(entry.getValue());
	}
}
