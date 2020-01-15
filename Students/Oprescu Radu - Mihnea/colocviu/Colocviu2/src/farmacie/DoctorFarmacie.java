package farmacie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoctorFarmacie implements TipBoala {

	Random rand = new Random();
	private boolean corinca = rand.nextBoolean();

	List<String> medicamente = new ArrayList<String>();

	public DoctorFarmacie(boolean corinca, List<String> medicamente) {
		this.corinca = corinca;
		this.medicamente = medicamente;
	}

	public boolean isCorinca() {
		return corinca;
	}

	public void setCorinca(boolean corinca) {
		this.corinca = corinca;
	}

	public List<String> getMedicamente() {
		return medicamente;
	}

	public void setMedicamente(List<String> medicamente) {
		this.medicamente = medicamente;
	}

	public void consultatie(DoctorFarmacie d) {
		if (d.isCorinca() == false)
			System.out.println("Boala cronica");
		else
			System.out.println("Boala acuta");
	}

}
