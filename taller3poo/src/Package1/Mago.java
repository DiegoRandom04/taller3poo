package Package1;
import java.util.ArrayList;

public class Mago {
	private ArrayList<Hechizo> arrayHechizo;
	private String nombre;
	
	public Mago(String nombre, ArrayList<Hechizo> arrayHechizo) {
		//Este es el constructor de mago que solcita el nombre y el arrayHechizo ya armado
		this.arrayHechizo = arrayHechizo;
		this.nombre = nombre;
		
	}
	
	public float getPuntaje() {
		float puntajeTotal = 0;
		for (int i = 0; i < arrayHechizo.size(); i++) {
			puntajeTotal += arrayHechizo.get(i).getPuntaje();
		}
		return puntajeTotal;
	}
}
