package lab8pr1;

import java.io.IOException;

public class Lucrator extends CalendarLucru {

	CalendarLucru calendar = new CalendarLucru();
	String nume = new String();
	String prenume = new String();

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		if (zi != calendar.saptamna[6].nume && zi != calendar.saptamna[7].nume) {
			System.out.println("Zi lucratoare");
		} else
			throw new ExceptieZiNelucratoare("zi nelucratoare");

	}

}
