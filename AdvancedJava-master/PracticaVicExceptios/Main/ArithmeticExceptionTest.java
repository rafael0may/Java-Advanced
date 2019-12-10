package Main;

public class ArithmeticExceptionTest {

	public static void main(String[] args) {
		try {
			int num1 = 30; int num2 = 0;
			int output=num1/num2;
			System.out.println("result: " + output);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir we :( " + e);
		}
	}

}
