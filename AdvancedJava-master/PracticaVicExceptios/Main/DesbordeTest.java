package Main;

public class DesbordeTest {

	public static void main(String[] args) {
		boolean flagError = false;
		try {
			int a[] = new int[10];
			a[11] = 9;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			flagError = true;
		} finally {
			if (flagError) {
				System.out.println("ejecucion sin errorres we :)");
			}else {
				System.out.println("ejecucion con errorres we :(");
			}
		}
		System.out.println("Test");
	}

}
