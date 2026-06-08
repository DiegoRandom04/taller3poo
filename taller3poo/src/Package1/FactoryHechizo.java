package Package1;

public class FactoryHechizo {
	//este es un factory que dependiendo del formato del constructor que se le pase va a devolver la clase hechizo con el cálculo de puntaje correspondiente
	public Hechizo crearPlanta(String nombre, float daño,String tipo, float duracionStunt,float cantPlantas) {// HechizoPlanta
		Hechizo hechizo = new HechizoPlanta(nombre,daño,tipo,duracionStunt,cantPlantas);
		return hechizo;
	}
	
	public Hechizo crearFuego(String nombre, float daño, String tipo, float duracionQuemadura) {//HechizoFuego
		Hechizo hechizo = new HechizoFuego(nombre,daño,tipo,duracionQuemadura);
		return hechizo;
	}
	
	public Hechizo crearTierra(String nombre, float daño, String tipo, float mejoraDefensa) { //hechizoTierra
		Hechizo hechizo = new HechizoTierra(nombre,daño,tipo,mejoraDefensa);
		return hechizo;
	}
	
	public Hechizo crearAgua(String nombre, float daño, String tipo, float cantidadHeal, float presionDelAgua) {
		Hechizo hechizo = new HechizoAgua(nombre,daño,tipo,cantidadHeal,presionDelAgua);
		return hechizo;
	}

	
	
}
