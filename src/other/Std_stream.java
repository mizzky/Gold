package other;

import java.util.Optional;
import java.util.stream.Stream;

public class Std_stream {
	public static void main(String[] args) {

		Stream<String> stream1 = Stream.generate(() -> "あ");
		Stream<Integer> stream2 = Stream.iterate(1, i-> ++i);

		stream1.limit(3).forEach(value -> System.out.println(value));
		stream2.limit(3).forEach(value -> System.out.println(value));

		Stream<String> stream = Stream.of("a", "b", "c", "d");


		Optional<String> result = stream.reduce(
				(String joined, String element) -> {
					return joined + "/" + element;
				}
				);

		System.out.println(result);


	}



}
