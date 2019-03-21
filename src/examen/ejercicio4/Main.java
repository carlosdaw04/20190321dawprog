package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> agenda = new ArrayList<String>();
		
		String pattern_registrar = "^[a-zA-Z]{1,}(-[0-9]+)";
		String pattern_buscar = "^buscar:[a-zA-Z]{1,}";
		String entrada = "";
		while (!entrada.equals("Fin")) {
			System.out.println("Agrega o busca un numero: ");
			entrada = sc.nextLine();
			if(Pattern.matches(pattern_registrar, entrada))
				agenda.add(entrada);
			else if(Pattern.matches(pattern_buscar, entrada)) {
				String nombre = entrada.substring(7);
				int long_nombre = nombre.length();
				
				if(agenda.contains(entrada)){
					for(int i=0; i<agenda.size(); i++) {
						if(nombre.matches(agenda.get(i).substring(0, long_nombre))) {
							System.out.println(agenda.get(i));
						}
					}
				}else {
					System.out.println(entrada.substring(7) + " no se encuentra en la agenda.");
				}
			}else {
				System.out.println("Vuelve a introducir los datos: ");
			}
				
		}
		
		for(int i=0; i<agenda.size(); i++) {
			System.out.println(agenda.get(i));
		}
	}

}
