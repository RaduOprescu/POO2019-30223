package lab8pr1;

public class CalendarLucru extends Zi {

	Zi[] saptamna = new Zi[7];

	public CalendarLucru() {
		saptamna[1].lucratoare = true;
		saptamna[2].lucratoare = true;
		saptamna[3].lucratoare = true;
		saptamna[4].lucratoare = true;
		saptamna[5].lucratoare = true;
		saptamna[1].nume = "Luni";
		saptamna[2].nume = "Marti";
		saptamna[3].nume = "Miercuri";
		saptamna[4].nume = "Joi";
		saptamna[5].nume = "Vineri";
		saptamna[6].nume = "Sambata";
		saptamna[7].nume = "Duminica";
		// super();
	}

	public void setLibere() {
		saptamna[6].lucratoare = false;
		saptamna[7].lucratoare = false;
	}

}
