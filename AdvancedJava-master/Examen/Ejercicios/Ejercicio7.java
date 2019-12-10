package Ejercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {

	public static void main(String[] args) {
		Map<String, String> personajes = new HashMap<>();
		String ruta = "C:\\Users\\curso\\Desktop\\AcademiaRMP\\OneDrive_2_04-12-2019\\Java-Advanced";
		personajes.put("a1234", "Steve Jobs");
		personajes.put("a1235", "Scott McNealy");
		personajes.put("a1236", "Jeff Bezos");
		personajes.put("a1237", "Larry Ellison");
		personajes.put("a1237", "Bill Gates");
		Ejercicio7 e = new Ejercicio7();
		e.obtenerPersonaje(personajes, "a1234");
		//e.newFile(ruta, e.obtenerPersonaje(personajes, "a1234"));
	}
	public boolean newFile(String ruta, String contenido) {
		try {
            File file = new File(ruta);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
            return true;
        	} catch (Exception e) {
        		e.printStackTrace();
        	}
		return false;
	}
	public String obtenerPersonaje(Map personajes, String llave) {
		String personaje;
		personaje = "ID: " + llave + " " + "Millonario: " + (String) personajes.get(llave);
		System.out.println(personaje);
		return personaje;
	}

}
