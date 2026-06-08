package Package1;

public class HechizoFuego extends Hechizo{
	private float duracionQuemadura;

	public HechizoFuego(String nombre, float daño, String tipo, float duracionQuemadura) {
		super(nombre, daño,tipo);
		this.duracionQuemadura = duracionQuemadura;
		this.puntaje = calcularPuntaje();
	}

	private float calcularPuntaje() {
		//calula el puntaje por el daño de la clase padre por la quemadura
		float puntaje = this.daño*duracionQuemadura;
		return puntaje;
	}
	
	
	
	
	
	
	
	
}
