package examen.ejercicio2;

import examen.ejercicio1.Figura;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.ComparatorRellenoPerimetro;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.Rectangulo;
import examen.ejercicio1.Sprite;

public class Main {

	public static void main(String[] args) {
		Set<Figura> set = new HashSet<Figura>();
		set.add(new Circulo(Color.black, 50, 50, true, 5));
		set.add(new Rectangulo(Color.blue, 10, 20,false,  5, 5));
		set.add(new Cuadrado(Color.white, 14, 20, false, 20));
		
		mostrarLista(set);

		List<Figura> lista = new ArrayList<Figura>();
		lista.addAll(set);

		Collections.sort(lista);
		System.out.println();
		mostrarLista(lista);
		
		System.out.println();
		Collections.sort(lista, new ComparatorRellenoPerimetro());
		mostrarLista(lista);
	}
	
	public static void mostrarLista(Collection<Figura> lista) {
		Iterator<Figura> i = lista.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
