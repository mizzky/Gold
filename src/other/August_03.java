package other;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface Interfacetalk{
	public String hi(String str);
}

public class August_03 {
	public static void main(String[] args) {

		Interfacetalk hello = name -> "こんちわ" + name ;
		Interfacetalk bye = name -> "バイバイ" + name;

		Consumer<String> thanks = string -> System.out.println("Thank you " + string);
		Function<String, String> function = name -> "Hi " + name;
		Predicate<Integer> natural = num -> num > 0;

		System.out.println(natural.test(100));

		System.out.println(function.apply("TARO"));
		thanks.accept("先生");
		System.out.println(hello.hi("神様"));
		System.out.println(bye.hi("世界"));
	}

}
