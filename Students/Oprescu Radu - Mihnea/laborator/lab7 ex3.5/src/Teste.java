
import java.awt.Color;

public class Teste {
	public static void repaint(Masina m, Color newColor) {
		m.colorCar= newColor;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Masina m= new Masina(Color.BLUE,"Toyota");
		
		System.out.println("Masina inainte de clonare:" + m);
		
		Masina mClona=m;
		Masina mDeep=(Masina) m.clone();
		System.out.println("Masina originala: "+ m);
		System.out.println("Masina : "+ mClona);
		System.out.println("Masina originala: "+ mDeep);
	}
}
///nu functioneaza