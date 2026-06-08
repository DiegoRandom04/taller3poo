package Package1;

import java.util.Scanner;
import java.uti.ArrayList;
public class Main {

	public static void main(String[] args) {
		//Diego Rebolledo Arancibia ; Rut 21.718.461-4; Carrera: Ingenieria en computación e Informática
		//primero se crea todo lo necesario, factory y el menu correspondiente despues del menu que accederá el usuario
		Scanner userEntry = new Scanner(System.in);
		String userInput = "";// usar en todas las optiones de usuario.
		
		System.out.println("Bienvenido al programa sobre Magos y Hechicerias :D");
		FactoryHechizo  factoryHechizo = new FactoryHechizo();// Factory, solo habrá 1 en todo el programa ya que solo se encarga de crear las clases hechizos necesarias
		
		do {
			System.out.println("[1]Menú Administrador | [2] Menú Análicis");
			userInput = userEntry.nextLine();
			if (!userInput.equals("1") && !userInput.equals("2")) {
				System.out.println("Entrada no válida. Intente nuevamente...");
			}	
		}while(!userInput.equals("1") && !userInput.equals("2"));//  si la entrada es distinta de 1 o de 2 (para simplicidad son string) no se arrancara ningún menú hasta que sea válida la elección
		
		MenuAdmin menuAdmin; MenuUsuario menuAnalicis; // se definen los menus y se creara el necesario, por temas de jerarquia para que sea visible posteriormente
		switch (userInput) {
			case ("1"):{
				menuAdmin = new MenuAdmin();
				menuAdmin.iniciarMenu();
				break;
			}
			case ("2"):{
				menuAnalicis = new MenuUsuario();
				//menuAnalicis.inciarMenu();
				break;
			}
		}// fin del switch
		
		
		
		
		
	}

}
