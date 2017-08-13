package other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Std_collection {
	public static void main(String[] args) {

		//HashMap

		Map<Integer, String> m1 = new HashMap<>();
		m1.put(2, "j");
		m1.put(3, "z");
		m1.put(1, "a");

		for(Map.Entry<Integer, String> entry : m1.entrySet()){
			System.out.print(entry.getValue());
		}

		System.out.println();


		//TreeMap
		Map<Integer, String> m2 = new TreeMap<>();
		m2.put(2, "j");
		m2.put(3, "z");
		m2.put(1, "a");


		for(Map.Entry<Integer, String> entry : m2.entrySet()){
			System.out.print(entry.getValue());
		}
		System.out.println();


		//LinkedHashMap
		Map<Integer, String> m3 = new LinkedHashMap<>();
		m3.put(2, "j");
		m3.put(3, "z");
		m3.put(1, "a");


		for(Map.Entry<Integer, String> entry : m3.entrySet()){
			System.out.print(entry.getValue());
		}

		System.out.println();
		System.out.println("-------------");

		//arrays.sort
		String[] countries = {"America", "Japan", "Korea"};
		Arrays.sort(countries, (c1, c2) -> c1.compareTo(c2));

		Arrays.stream(countries)
				.forEach(country -> System.out.println(country + " "));

	}
}
