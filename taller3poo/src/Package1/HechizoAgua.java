package Package1;

public class HechizoAgua extends Hechizo{
	private float cantidadHeal;
	private float presionDelAgua;
	public HechizoAgua(String nombre, float daño, String tipo, float cantidadHeal,float presionDelAgua) {
		super(nombre, daño, tipo);
		this.cantidadHeal = cantidadHeal;
		this.presionDelAgua = presionDelAgua;
		this.setPuntaje(calcularPuntaje());
	}
	private float calcularPuntaje() {
		//aqui lo que se hace es calcular el puntaje y se procede a agregar a la variable puntaje para simplificar la escritura
		float puntaje = (daño+cantidadHeal+presionDelAgua)*1;
		return puntaje;
	}
	

}
