package Package1;

public class HechizoTierra extends Hechizo{
	private float mejoraDefensa;

	public HechizoTierra(String nombre, float daño,String tipo, float mejoraDefensa) {
		super(nombre, daño, tipo);
		this.mejoraDefensa = mejoraDefensa;
		this.puntaje = calcularPuntaje();
	}
	private float calcularPuntaje() {
		float puntaje = (this.daño*mejoraDefensa)/2;
		return puntaje;
	}
	
}
