package Package1;
import java.util.ArrayList;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class MenuAdmin {
	private ArrayList<Mago> arrayMago;
	private ArrayList<Hechizo> arrayHechizo;
	private File archMago;
	private	File archHechizo;
	
	public void MenuAdmin () {
		//constructor de menu admin, solo se necesita crear una instancia
		archMago = new File("Magos.txt");
		archHechizo = new File("Hechizos.txt");
	}
	
	public void iniciarMenu() {
		System.out.println("Bienvenido Administrador");
		Scanner userEntry = new Scanner(System.in);
		
		
		
		boolean reiniciarMenu = true;
		
		do {
			// el menu se reiniciara tantas veces sea necesario
			String userInput = "";// esta variable guardara las entradas de usuario
			System.out.println("Presione la tecla correspondiente para acceder a cada opción del menú");	
			
			do {
				
				System.out.println("[1] Agregar mago | [2] Modificar Mago | [3] EliminarMago | [4] AgregarHechizo | [5]  Modificar Hechizo | [6] Eliminar Hechizo | [S] Salir del programa");
				userInput = userEntry.nextLine();
			}while(!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && !userInput.equals("4") && !userInput.equals("5") && !userInput.equals("6") && !userInput.equalsIgnoreCase("S"));
			if (userInput.equalsIgnoreCase("S")) {
				reiniciarMenu = false;
			}
			
			else if (userInput.equals("4")) {
				
				
				
				System.out.println("Agregar hechizo...");
				System.out.println("Ingrese el nombre del Hechizo: ");
				String nombre = userEntry.nextLine();
				String tipo;
				do {
				System.out.println("Ingrese el tipo de Hechizo");
				System.out.println("[1] Agua | [2] Tierra | [3] Fuego | [Planta]");
				tipo = userEntry.nextLine();
				
				
				}while(!tipo.equals("1")  && !tipo.equals("2") &&!tipo.equals("3") &&!tipo.equals("4"));
				
				boolean entradaValida = false;
				if (tipo.equals("1")) {
					
					float cantHeal=0;
					float presionDelAgua=0;
					float daño;
					
					do {
						try {
							System.out.println("Ingrese la cantidad recuperacion");
							 cantHeal= Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para cantidad recuperacion");
					}
					}while (entradaValida == false);
					entradaValida = false;
					
					do {
						try {
							System.out.println("Ingrese la cantidad de daño");
							daño = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
								System.out.println("Dato invalido para daño");
					}
					}while (entradaValida == false);
					try{
					FileWriter writer = new FileWriter(archHechizo,true);
					BufferedWriter escritor = new BufferedWriter(writer);
					escritor.write(nombre + ";"+ "Agua" + ";" + cantHeal + ";" +  presionDelAgua);
					escritor.flush(); escritor.close();
					}catch(Exception e) {
						
					}
					
					

			}// fin de la subcondicional del tipo de Hechizo
				
				if (tipo.equals("2")) {
					float cantHeal=0;
					float mejoraDefensa=0;
					float daño;;
					
					do {
						try {
							System.out.println("Ingrese mejora Defensa");
							cantHeal = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para mejora Defensa");
					}
					}while (entradaValida == false);
					entradaValida = false;
						
					do {
						try {
							System.out.println("Ingrese la cantidad de daño");
							daño = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para cantHeal");
				}
					}while (entradaValida == false);
					try {
					FileWriter writer = new FileWriter(archHechizo,true);
					
					BufferedWriter escritor = new BufferedWriter(writer);
					escritor.write(nombre + ";"+ "Tierra" + ";" + mejoraDefensa + ";");
					escritor.flush(); escritor.close();
					}catch(Exception e) {
						
					}
					
					

			}// fin de la subcondicional del tipo de Hechizo
				
				if (tipo.equals("3")) {
					float duracionQuemadura=0;
					float daño;;
					
					do {
						try {
							System.out.println("Ingrese la Duracion Quemadura");
							duracionQuemadura = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para duracionQuemadura");
					}
					}while (entradaValida == false);
					entradaValida = false;
					try {
						
					
					FileWriter writer = new FileWriter(archHechizo, true);		
					BufferedWriter escritor = new BufferedWriter(writer);
					escritor.write(nombre + ";"+ "Fuego" + ";" + duracionQuemadura);	
					escritor.flush(); escritor.close();
					}catch (Exception e) {
						
					}
				
				
			}// fin condicional opción 3 menu		
				
				if (tipo.equals("4")) {
					float cantPlantas = 0;
					float duracionStunt = 0;
					float daño;
					
					do {
						try {
							System.out.println("Ingrese la cantidad de plantas");
							cantPlantas = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para cantidad de plantas");
					}
					}while (entradaValida == false);
					entradaValida = false;
					do {
						try {
							System.out.println("Ingrese  la duracion Stunt");
							duracionStunt = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
								System.out.println("Dato invalido para duracion Stunt");
					}
					}while (entradaValida == false);
				
					do {
						try {
							System.out.println("Ingrese la cantidad de daño");
							daño = Float.parseFloat(userEntry.nextLine());
							entradaValida = true;
						}catch(Exception e) {
							System.out.println("Dato invalido para cantHeal");
						}
					}while (entradaValida == false);
					try {
					FileWriter writer = new FileWriter(archHechizo,true);
					BufferedWriter escritor = new BufferedWriter(writer);
					escritor.write(nombre + ";"+ "Planta" + ";" +  duracionStunt + ";" + cantPlantas );
					escritor.flush(); escritor.close();
					}catch(Exception e) {
						
					}
					
				
				}
				
			}//fin condicional opcion 1 del menu
			else if (userInput.equals("2")) {
				
			}
				
				
				
		}while (reiniciarMenu == true);// si se elije que se salga del programa se termina la ejecución
		}
		
	
	
}
