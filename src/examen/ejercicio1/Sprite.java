package examen.ejercicio1;

import java.awt.image.BufferedImage;

public class Sprite {

	BufferedImage bitmap;
	private int eje_y;
	private int eje_z;
	
	public BufferedImage getBitmap() {
		return bitmap;
	}
	public int getEje_z() {
		return eje_z;
	}
	public void setEje_z(int eje_z) {
		this.eje_z = eje_z;
	}
	public int getEje_y() {
		return eje_y;
	}
	public void setEje_y(int eje_y) {
		this.eje_y = eje_y;
	}

}
