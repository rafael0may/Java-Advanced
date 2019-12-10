package Main;

public class Principal {

	public static void main(String[] args) {
		String [] Nombres = {"Rafael",
							"Tigres",
							"Gonzalo",
							"Ricardo",
							"Dinora",
							"Denice",
							"Dora",
							"Ernesto",
							"Adriana",
							"Jose"};
		Usuarios newList = new Usuarios(Nombres);
		newList.Presentar();
		newList.Ordenar();
		newList.Presentar();

	}

}
