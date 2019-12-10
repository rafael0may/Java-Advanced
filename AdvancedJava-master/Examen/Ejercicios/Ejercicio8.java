package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio8 {

	public static void main(String[] args) {
		List<String> paises= new ArrayList<>();
		paises.add("Sudafrica");
		paises.add("Egipto");
		paises.add("Turquia");
		paises.add("Rusia");
		paises.add("China");
		paises.add("India");
		List<String> paises2 = new ArrayList<>();
		paises2.add("Francia");
		paises2.add("México");
		paises2.add("Australia");
		paises2.add("Italia");
		paises2.add("Argentina");
		paises2.add("Brasil");
		Ejercicio8 e = new Ejercicio8();
		e.newList(paises, paises2);
	}
	public List<String> newList(List<String> a, List<String> b){
		List<String> paises3= new ArrayList<>();
		paises3.addAll(a);
		paises3.addAll(b);
		Collections.sort(paises3);
		for (String string : paises3) {
			System.out.println(string);
		}
		return paises3;
	}

}
