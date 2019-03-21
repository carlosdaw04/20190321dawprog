package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends Figura {

	private int lado;
	
	public Cuadrado() {}

	public Cuadrado(Color color, int y, int z,boolean rellena, int lado) {
		super(color, y, z, rellena);
		this.setArea(Math.pow(lado, 2));
		this.setPerimetro(4 * lado);
		this.lado = lado;
	}

	public Cuadrado(Color color, int y, int z, int lado) {
		super(color, y, z);
		this.setArea(Math.pow(lado, 2));
		this.setPerimetro(4 * lado);
		this.lado = lado;
	}

	public Cuadrado(int y, int z,boolean rellena, int lado) {
		super(y, z, rellena);
		this.setArea(Math.pow(lado, 2));
		this.setPerimetro(4 * lado);
		this.lado = lado;
	}
	public int setLado() {
		return lado;
	}

	public void setRadio(int lado) {
		this.lado = lado;
	}
	

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]" + super.toString();
	}
}
