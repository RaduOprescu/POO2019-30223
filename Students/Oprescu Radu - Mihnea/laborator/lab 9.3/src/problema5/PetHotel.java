package problema5;

import java.util.List;

import problema4.FacebookAccount;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PetHotel {

	String nume;
	String rasa;
	int varsta;
	String hotel;
	boolean locuriLibere;
	int limitaMaxima;
	Date data_in = new Date();
	Date data_out = new Date();
	List<PetHotel> listaCaini = new ArrayList<PetHotel>();

	public PetHotel(String nume, String rasa, int varsta, String hotel, int limitaMaxima, boolean locuriLibere,
			Date data_in, Date data_out, List<PetHotel> listaCaini) {
		this.nume = nume;
		this.rasa = rasa;
		this.varsta = varsta;
		this.hotel = hotel;
		this.limitaMaxima = limitaMaxima;
		this.locuriLibere = locuriLibere;
		this.data_in = data_in;
		this.data_out = data_out;
		this.listaCaini = listaCaini;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getLimitaMaxima() {
		return limitaMaxima;
	}

	public void setLimitaMaxima(int limitaMaxima) {
		this.limitaMaxima = limitaMaxima;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public boolean isLocuriLibere() {
		return locuriLibere;
	}

	public void setLocuriLibere(boolean locuriLibere) {
		this.locuriLibere = locuriLibere;
	}

	public Date getData_in() {
		return data_in;
	}

	public void setData_in(Date data_in) {
		this.data_in = data_in;
	}

	public Date getData_out() {
		return data_out;
	}

	public void setData_out(Date data_out) {
		this.data_out = data_out;
	}

	public List<PetHotel> getListaCaini() {
		return listaCaini;
	}

	public void setListaCaini(List<PetHotel> listaCaini) {
		this.listaCaini = listaCaini;
	}

	public void cazareCaini(List<PetHotel> listaCaini,PetHotel caine, int locuriOcupate, boolean locuriLibere, Date data,
			int limitaMax) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		for (PetHotel i : listaCaini) {
			if (locuriLibere == true) {
				locuriOcupate++;
				if (limitaMaxima == locuriOcupate) {
					locuriLibere = false;
				}
				if(data.equals(dtf.format(now))) {
					listaCaini.add(caine);
				}
			}
		}
	}
	public void eliberareCaini(List<PetHotel> listaCaini,PetHotel caine, int locuriOcupate, boolean locuriLibere,
			int limitaMax){
		for(PetHotel i: listaCaini) {
			listaCaini.remove(caine);
			locuriOcupate--;
			if(locuriLibere==false)
				locuriLibere=true;
		}
	}
	
	public String toString() {
		return nume+" "+rasa+" "+varsta+" "+hotel+" "+data_in+" "+data_out;
	}
	
	public void printList(PetHotel hotel) {
		System.out.println(hotel.listaCaini);
	}
}
