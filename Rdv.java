package tp2;

public class Rdv {
	
	String DateRDV,HeureRDV,CIN,Id;
	public Rdv(String id, String dateRDV, String heureRDV, String cIN) {
		super();
		Id = id;
		DateRDV = dateRDV;
		HeureRDV = heureRDV;
		CIN = cIN;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getDateRDV() {
		return DateRDV;
	}
	public void setDateRDV(String dateRDV) {
		DateRDV = dateRDV;
	}
	public String getHeureRDV() {
		return HeureRDV;
	}
	public void setHeureRDV(String heureRDV) {
		HeureRDV = heureRDV;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
}
