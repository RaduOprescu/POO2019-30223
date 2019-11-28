import java.util.Arrays;

public class Sortare {
	public static void main(String[] args) {
		Persoana[] p= new Persoana[3];
		p[0]= new Persoana("Popescu", "George",18);
		p[1]= new Persoana("Abrudan", "Teodora",20);
		p[2]= new Persoana("Karim", "Sergiu",18);

		Arrays.sort(p);
		for(int i=0;i<3;i++) {
			System.out.println(p[i]);
			
		}
		
	}
}
