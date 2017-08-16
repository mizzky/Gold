package other;

import java.util.Arrays;
import java.util.List;

public class Std_stream {
	public static void main(String[] args) {



		List<String> list = Arrays.asList("さとうたろう", "さとうじろう","さいとうさぶろう");
		System.out.println(
				list.stream()
					.filter(s -> s.contains("さとう"))
					.reduce((s,t) -> s + t)
					.get());





//		List<Integer> list = Arrays.asList(200, 100, 300);
//		Optional<Integer> s = list.stream()
//								  .min(Comparator.naturalOrder());
//		System.out.println(s.get());
//
//		Stream<String> stream1 = Stream.generate(() -> "あ");
//		Stream<Integer> stream2 = Stream.iterate(1, i-> ++i);
//
//		stream1.limit(3).forEach(value -> System.out.println(value));
//		stream2.limit(3).forEach(value -> System.out.println(value));
//
//		Stream<String> stream = Stream.of("a", "b", "c", "d");
//

//		Optional<String> result = stream.reduce(
//				(String joined, String element) -> {
//					return joined + "/" + element;
//				}
//				);
//
//		System.out.println(result);


//		String result2 = stream.reduce(
//				" ",
//				(String joined , String element) -> {
//					return joined + "/" + element;
//				}
//				);
//		System.out.println("result2: " + result2);
//
//		StringBuilder result3 = stream.sequential().reduce(
//				new StringBuilder(),
//				(StringBuilder joined, String element) -> {
//					return joined.append("/").append(element);
//				},
//				(StringBuilder left, StringBuilder right) -> {
//					return left.append("*").append(right);
//				}
//				);
//
//		System.out.println(result3);


	}
}
