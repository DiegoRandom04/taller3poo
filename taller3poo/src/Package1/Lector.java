package Package1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Lector {
	private File archivoMago;
	private File archivoHechizo;
	private ArrayList<Hechizo> arrayHechizo; 
	private ArrayList<Mago> arrayMago;
	
	public Lector() {
		// este es el constructor de hechizo
		this.archivoMago = new File("Magos.txt");
		this.archivoHechizo = new File("Hechizos.txt");
		this.arrayMago = new ArrayList<Mago>();
		this.arrayHechizo = new ArrayList<Hechizo>();
	}
	public void obtenerMagos() {// aqui lo que se hace es construir el array mago
	//nota: antes de ejecutar obtenerMagos primero se debe obteener Hechizo;
		try {
			ArrayList<Hechizo> arrayHechizoMago = new ArrayList<Hechizo>();
			Scanner lectorMago = new Scanner(archivoMago);
			while (lectorMago.hasNextLine()) {
				String linea = lectorMago.nextLine();
				String [] lineaPartes = linea.split("");
				String nombreMago = lineaPartes[0];
				String [] vectorHechizo = lineaPartes[2].split("|"); 
				for (int i = 0;i < vectorHechizo.length;i++) {
					for (int x = 0; i < arrayHechizo.size();i++) {
						if (vectorHechizo[i].equals(arrayHechizo.get(i).getNombre())) { // si el nombre del hechizo que se lee del mago, es igual al hechizo, que se agregue la referencia de hechizo a arrayMagos para crear el objeto de mago
							arrayHechizoMago.add(arrayHechizo.get(x));
						}
					}
				}
				Mago mago = new Mago(nombreMago, arrayHechizo);// se construye1
				this.arrayMago.add(mago);//aqui ya se agrego el objeto mago correctamente
			}//fin de ciclo de lectura
			lectorMago.close();// cierra el lector mago

		}catch(IOException e) {
			System.out.println("Error al leer Magos.txt");
		}
		// esto lo que hace es crear el Arraylist de magos
	}
	 
	public ArrayList<Hechizo> obtenerHechizo(FactoryHechizo factoryHechizo){
		/*Factory hechizo se encarga de crear los hechizos necesariso segun se le solicite
		 * con las condicionales dependindo de que la linea vaya indicando el tipo de hechizo se ejecutara el constructor de la subclase correspondiente 
		 * para la clase padre, arrayHechizo es un array sobre la clase padre para simplificar el problema
		 * la subclase el unico proposito que tiene es el de crear el puntaje correcto para la clase padre
		 */
	
		try {
			Scanner lectorHechizo = new Scanner(this.archivoHechizo);
			while(lectorHechizo.hasNextLine()) {
				String linea = lectorHechizo.nextLine();
				String [] lineaPartes = linea.split(";");
				String nombreHechizo = lineaPartes[0];
				String tipoHechizo = lineaPartes[1];
				
				switch (tipoHechizo){
				/*Aclaro que el switch sirve para llamar al factory para poder crear el hechizo Correspondiente 
				 * para añadirlo al array hechizo, ademas de que solo es necesario guardarlo como hechizo ya que la subclase
				 * unicamente tiene el proposito de crear el puntaje correspondiente al hechizo.
				 */				
				case ("Agua"):{
					Hechizo hechizo = factoryHechizo.crearAgua(nombreHechizo, Float.parseFloat(lineaPartes[2]), tipoHechizo, Float.parseFloat(lineaPartes[3]), Float.parseFloat(lineaPartes[4]));
					this.arrayHechizo.add(hechizo);// se añade el hechizo al array para el mago
					break;
				}
				case ("Tierra"):{
					Hechizo hechizo = factoryHechizo.crearTierra(nombreHechizo, Float.parseFloat(lineaPartes[2]), tipoHechizo, Float.parseFloat(lineaPartes[3]));
					this.arrayHechizo.add(hechizo);// se añade el hechizo al array para el mago
					break;
				}
					
				case ("Fuego"):{
					Hechizo hechizo = factoryHechizo.crearFuego(nombreHechizo, Float.parseFloat(lineaPartes[2]), tipoHechizo, Float.parseFloat(lineaPartes[3]));
					this.arrayHechizo.add(hechizo);// se añade el hechizo al array para el mago
					break;
				}
				
				case ("Planta"):{
					Hechizo hechizo = factoryHechizo.crearPlanta(nombreHechizo, Float.parseFloat(lineaPartes[2]), tipoHechizo, Float.parseFloat(lineaPartes[3]), Float.parseFloat(lineaPartes[4]));
					this.arrayHechizo.add(hechizo);// se añade el hechizo al array para el mago
					break;
				}
				}// fin del switch
				return this.arrayHechizo; // se retorna ya que esa clase Lector solo debe encargarse de entregar datos y no de ser multiusos, retorna arrayHechizo

			}
			
			
		}catch(IOException e) {
			System.out.println("No se ha podido leer Hechizos.txt");
			//simplemente para el cotrol de error, ya que deberia funcionar siempre que los archivos esten bien formateados.
			return null;
			
			
			
		}
		return arrayHechizo;
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
