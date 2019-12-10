package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		int valor1 = 12;
		int valor2 = 24;
		Ejercicio2 e = new Ejercicio2();
		e.evaluador(valor1,valor2);
		
	}
	public int evaluador(int valor1, int valor2) {
		if(valor1 < 22) {
			System.out.println(valor1);
			return valor1;
		}
		if(valor2 < 22) {
			System.out.println(valor2);
			return valor2;
		}
		System.out.println(0);
		
		return 0;
	}

}
