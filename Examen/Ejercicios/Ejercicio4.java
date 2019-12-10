package Ejercicios;

public class Ejercicio4 {

	public static void main(String[] args) {
		int cantidad = 3;
		int j[] = new int[cantidad];
		int k[] = new int[cantidad];
		j [0] = 1;
		j [1] = 2;
		j [2] = 3;
		k[0]= 4;
		k[1]= 5;
		k[2]= 6;
		Ejercicio4 e =new Ejercicio4();
		e.newArray(j, k);
		
	}
	public int[] newArray(int j[], int k[]) {
		int i[] = new int[2];
		i[0] = j[1];
		i[1] = k[1];
		System.out.println(i[0]+","+i[1]);
		return i;
	}
}
