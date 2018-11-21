package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJDK {
	public static void main(String[] args) throws IOException {
		/*List<String> l = Stream.of("one", "two", "three", "four")
		 .filter(e -> e.length() > 3)
		 .peek(e -> System.out.println("Filtered value: " + e))
		 .map(String::toUpperCase)
		 .peek(e -> System.out.println("Mapped value: " + e))
		 .collect(Collectors.toList());
		System.out.println(l);*/
		/*Stream.iterate(0, n -> n + 3).limit(10). forEach(x -> System.out.print(x + " "));
		Stream.iterate(2, n->n*3).limit(10).forEach(n->System.out.println(n+""));*/
		BufferedReader br = new BufferedReader(new FileReader("E:\\11.txt"));
		String st = br.readLine();
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		System.out.println(st);
		//test commit master
		System.out.println(st);
		
	/*	List<String> words = br.lines().
				 flatMap(line -> Stream.of(line.split(" "))).
				 filter(word -> word.length() > 0).
				 map(String::toLowerCase).
				 distinct().
				 sorted().
				 collect(Collectors.toList());
				br.close();
				System.out.println(words);*/
		/*List<String> words  = br.lines().flatMap(line -> Stream.of(line.split(" "))).map(String::toUpperCase).distinct().sorted().collect(Collectors.toCollection( ArrayList ::new ));
		System.out.println(words);*/
	}

}
