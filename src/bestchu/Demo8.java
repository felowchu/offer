package bestchu;

import java.util.stream.IntStream;

public class Demo8 {
	public static void main(String[] args) {
		IntStream.of(new int[]{1,2,3}).forEach(System.out::println);
	}
}
