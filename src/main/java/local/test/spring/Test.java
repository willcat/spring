package local.test.spring;

import java.util.Optional;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		final String text = "Hallo World!";
		System.out.println(lowerCase(text));//方法一
		lowerCase(null, System.out::println);//方法二
	}

	private static String lowerCase(String str) {
		return Optional.ofNullable(str).map(s -> s.toLowerCase()).map(s->s.replace("world", "java")).orElse("NaN");
	}

	private static void lowerCase(String str, Consumer<String> consumer) {
		consumer.accept(lowerCase(str));
	}
}
