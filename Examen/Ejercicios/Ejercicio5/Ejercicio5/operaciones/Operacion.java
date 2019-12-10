package Ejercicio5.operaciones;
import Ejercicio5.interfaz.*;
public class Operacion implements Interfaz{
	double n1;
	double n2;
	double result;
	
	public Operacion(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	@Override
	public double Suma() {
		this.result = this.n1 + this.n2; 
		System.out.println(result);
		return result;
	}
	@Override
	public double Resta() {
		this.result = this.n1 - this.n2;
		System.out.println(result);
		return result;
	}
	@Override
	public double Multi() {
		this.result = this.n1 * this.n2; 
		System.out.println(result);
		return result;
	}
	@Override
	public double Div() {
		if(n2 != 0) {
			this.result = this.n1 / this.n2; 
			System.out.println(result);
			return result;
		}else {
			System.out.println("no se puede dividir entre cero we :(");
		}
		return 0;
	}
	
	
}
