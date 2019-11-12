import java.util.*;

public class TestGhiozdan {
	
	public static void main(String[] args) {
		Ghiozdan g= new Ghiozdan();
		Manual m=new Manual();
		Caiet c= new Caiet();
		Manual m1= new Manual();
		Caiet c1= new Caiet();
		Manual m2= new Manual();
		c.setNume("Matematica");
		c1.setNume("Romana");
		m.SetNume("Engleza");
		m1.SetNume("Geografie");
		m2.SetNume("Biologie");
		g.add(c, 0);
		g.add(c1, 1);
		g.add(m, 2);
		g.add(m1, 3);
		g.add(m2, 4);
		g.getNrRechizite();
		g.getNrCaiete();
		g.getNrManuale();
		g.listItems();
		g.listCaiet();
		g.listManual();
	}
	
}
