package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuarios {
	int iterador = 0;
	private List<String>Nombres = new ArrayList<>();
	

	public Usuarios(String[] name) {
		for (String string : name) {
			Nombres.add(string);
		}
	}

	public List<String> getNombres() {
		return Nombres;
	}

	public void setNombres(String[] name) {
		for (String string : name) {
			Nombres.add(string);
		}
	}
	public void Presentar() {
		for (String string : this.Nombres) {
			System.out.println(iterador++ + " " + string);
			System.out.println("-------------------------");
		}
		iterador = 0;
	}
	public void Ordenar() {
		Collections.sort(this.Nombres);
	}
}
