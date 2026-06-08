package Package1;

public class Hechizo implements InterfazHechizo{
	protected String nombre;
	protected float daño;
	protected float puntaje;
	protected String tipo;
	public Hechizo(String nombre, float daño, String tipo) {
		super();
		this.nombre = nombre;
		this.daño = daño;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(float puntaje) {
		this.puntaje = puntaje;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
