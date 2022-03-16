package tp2;

public class Ordonnance {
	public String NumOrd;
	public String NomPatient,PrenomPatient,NomMedicament,DosageMedicament;
	public Ordonnance(String numOrd, String nomPatient, String prenomPatient, String nomMedicament,
			String dosageMedicament) {
		super();
		NumOrd = numOrd;
		NomPatient = nomPatient;
		PrenomPatient = prenomPatient;
		NomMedicament = nomMedicament;
		DosageMedicament = dosageMedicament;
	}
	public String getNumOrd() {
		return NumOrd;
	}
	public void setNumOrd(String numOrd) {
		NumOrd = numOrd;
	}
	public String getNomPatient() {
		return NomPatient;
	}
	public void setNomPatient(String nomPatient) {
		NomPatient = nomPatient;
	}
	public String getPrenomPatient() {
		return PrenomPatient;
	}
	public void setPrenomPatient(String prenomPatient) {
		PrenomPatient = prenomPatient;
	}
	public String getNomMedicament() {
		return NomMedicament;
	}
	public void setNomMedicament(String nomMedicament) {
		NomMedicament = nomMedicament;
	}
	public String getDosageMedicament() {
		return DosageMedicament;
	}
	public void setDosageMedicament(String dosageMedicament) {
		DosageMedicament = dosageMedicament;
	}
	
	
	
	
	
	
}
