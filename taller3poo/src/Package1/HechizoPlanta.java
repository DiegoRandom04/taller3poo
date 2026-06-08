package Package1;

public class HechizoPlanta extends Hechizo {
	private float duracionStunt;
	private float cantPlantas;

	public HechizoPlanta(String nombre, float daño,String tipo, float duracionStunt,
			float cantPlantas) {
		super(nombre, daño, tipo);
		this.duracionStunt = duracionStunt;
		this.cantPlantas = cantPlantas;
		this.puntaje = calcularPuntaje();
		
	}
	private float calcularPuntaje() {
		float puntaje = daño + (duracionStunt*cantPlantas);
		return puntaje;
	}
	
}
