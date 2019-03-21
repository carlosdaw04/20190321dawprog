package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends Figura {

	private int long_base;
	private int altura;

	public Rectangulo() {}

	public Rectangulo(Color color, int y, int z, boolean rellena, int long_base, int altura) {
		super(color, y, z, rellena);
		this.setArea(long_base * altura);
		this.setPerimetro(2 * (long_base + altura));
		this.long_base = long_base;
		this.altura = altura;
	}

	public Rectangulo(Color color,int y, int z, int long_base, int altura) {
		super(color, y, z);
		this.setArea(long_base * altura);
		this.setPerimetro(2 * (long_base + altura));
		this.long_base = long_base;
		this.altura = altura;
	}

	public Rectangulo(int y, int z, boolean rellena, int long_base, int altura) {
		super(y, z, rellena);
		this.setArea(long_base * altura);
		this.setPerimetro(2 * (long_base + altura));
		this.long_base = long_base;
		this.altura = altura;
	}

	public int getLong_base() {
		return long_base;
	}

	public void setLong_base(int long_base) {
		this.long_base = long_base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [long_base=" + long_base + ", altura=" + altura + "] " + super.toString();
	}
}
