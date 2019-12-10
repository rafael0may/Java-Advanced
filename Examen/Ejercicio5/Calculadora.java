import Ejercicio5.operaciones.*;
public class Calculadora {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 10;
		Operacion operacion = new Operacion(n1, n2);
		operacion.Suma();
		operacion.Resta();
		operacion.Multi();
		operacion.Div();
	}

}
