package Threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadsTest1 {
	public static void main(String[] args) {
		List<String> letras = new ArrayList<>();
		letras.add("H");
		letras.add("o");
		letras.add("l");
		letras.add("a");
		try {
			for (String letra : letras) {
				System.out.println(letra);
				if (letras.equals("H")) {
					letras.remove(letra);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(letras);
	} 
}
