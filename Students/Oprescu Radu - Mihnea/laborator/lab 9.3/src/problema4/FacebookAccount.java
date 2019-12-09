package problema4;

import java.util.List;
import java.util.ArrayList;

public class FacebookAccount {

	String nume, prenume;
	int varsta;
	String locatieCurenta;
	List<FacebookAccount> listaPrieteni = new ArrayList<FacebookAccount>();

	public FacebookAccount(String nume, String prenume, int varsta, String locatieCurenta,
			List<FacebookAccount> listaPrieteni) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.locatieCurenta = locatieCurenta;
		this.listaPrieteni = listaPrieteni;
	}

	public List<FacebookAccount> getListaPrieteni() {
		return listaPrieteni;
	}

//	public void setListaPrienteni(List<FacebookAccount> listaPrienteni) {
	// this.listaPrienteni = listaPrienteni;
	// }

	public void adaugaPrieteni(FacebookAccount myAccount, FacebookAccount friend) {
		myAccount.listaPrieteni.add(friend);

	}

	public void stergePrieten(FacebookAccount myAccount, FacebookAccount friend) {
		myAccount.listaPrieteni.remove(friend);
	}

	public String toString() {
		return nume+" "+prenume+" "+varsta+" "+locatieCurenta+" "+listaPrieteni;
	}

	public void afisarePrieteni(FacebookAccount myAccount) {
		//for (FacebookAccount i : myAccount.listaPrieteni) {
			//System.out.println(i.getListaPrieteni());
		//}
		System.out.println(myAccount.listaPrieteni);
	}
	
	public String searchFriends(FacebookAccount myAccount) {
		for(FacebookAccount i: myAccount.listaPrieteni) {
			if(myAccount.locatieCurenta.contentEquals(i.locatieCurenta) )
				return i.nume;
		}
		return "nici un prieten in apropiere";
	}

	public static void main(String args[]) {

	}

}
