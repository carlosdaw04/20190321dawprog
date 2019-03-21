package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends Figura {

	private int radio;
	
	public Circulo() {}

	public Circulo(Color color, int y, int z, boolean rellena, int radio) {
		super(color, y, z, rellena);
		this.setArea(Math.PI * Math.pow(radio, 2));
		this.setPerimetro(2 * Math.PI * radio);
		this.radio = radio;
	}
	
	public Circulo(Color color,int y, int z, int radio) {
		super(color, y, z);
		this.setArea(Math.PI * Math.pow(radio, 2));
		this.setPerimetro(2 * Math.PI * radio);
		this.radio = radio;
	}

	public Circulo(int y, int z, boolean rellena, int radio) {
		super(y, z, rellena);
		this.setArea(Math.PI * Math.pow(radio, 2));
		this.setPerimetro(2 * Math.PI * radio);
	}


	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "] " + super.toString();
	}
}
