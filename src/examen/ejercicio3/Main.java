package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero de compuestos quimicos: ");
		int tamaño = sc.nextInt();
		List<String> lista = new ArrayList<String>();
		String compuesto;
		int contador = 0;
		while(contador <= tamaño) {
			compuesto = sc.nextLine();
			lista.add(compuesto);
			contador++;
		 }

		List<String> no_repetido = new ArrayList<String>();
		for(int i = 0; i<lista.size(); i++) {
			if(!no_repetido.contains(lista.get(i))){
				no_repetido.add(lista.get(i));
			}
		}
		String no_r_string = "";
		for (String s : no_repetido) {
		    no_r_string += s + " ";
		}
		String[] parts = no_r_string.split(" ");
		
		no_repetido = new ArrayList<String>(Arrays.asList(parts));
		List<String> lista_final = new ArrayList<String>();
		for(int i = 0; i<no_repetido.size(); i++) {
			if(!lista_final.contains(no_repetido.get(i))){
				lista_final.add(no_repetido.get(i));
			}
		}
		
		for(int i = 0; i<lista_final.size(); i++) {
			System.out.print(lista_final.get(i) + " ");
		}
	}
}