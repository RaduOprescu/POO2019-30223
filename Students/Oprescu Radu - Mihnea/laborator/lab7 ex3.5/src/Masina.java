
import java.awt.Color;

public class Masina extends Student {
	Color colorCar;
	String marca = new String();

	public Masina(Color colorCar, String marca) {
		super();
		this.colorCar = colorCar;
		this.marca = marca;
	}

	public Masina() {
		
	}

	public Color getColorCar() {
		return colorCar;
	}

	public void setColorCar(Color colorCar) {
		this.colorCar = colorCar;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static void repaint(Masina m, Color newColor) {
		m.colorCar=newColor;
	}

}
