package examen.ejercicio1;

import java.awt.Color;

public class Figura implements Comparable<Figura> {

	private Color color = Color.BLACK;
	private int y;
	private int z;
	private boolean rellena = true;
	private double area;
	private double perimetro;
	
	public Figura() {}
	
	public Figura(Color color, int y, int z, boolean rellena) {
		this.color = color;
		this.y = y;
		this.z = z;
		this.rellena = rellena;
	}
	
	public Figura(int y, int z, boolean rellena) {
		this.y = y;
		this.z = z;
		this.rellena = rellena;
	}

	public Figura(Color color, int y, int z) {
		this.color = color;
		this.y = y;
		this.z = z;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public boolean isRellena() {
		return rellena;
	}

	public void setRellena(boolean rellena) {
		this.rellena = rellena;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	@Override
	public String toString() {
		return "Figura [color=" + color + ", y=" + y + ", z=" + z + ", rellena=" + (rellena ? "Rellena" : "Contorno") 
				+ ", area=" + area + ", perimetro=" + perimetro + "]";
	}

	@Override
	public int compareTo(Figura f) {
		if(area > f.area)
			return 1;
		else if (area < f.area) 
			return -1;
		else
		return 0;
	}
}
