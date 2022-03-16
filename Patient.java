package tp2;

public class Patient {
private String cin,nom,prenom,adresse;
String tel;
private int age;
public Patient(String cin, String nom, String prenom, String adresse, String tel,int age) {
	super();
	this.cin = cin;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.tel = tel;
	this.age=age;
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCin() {
	return cin;
}
public void setCin(String cin) {
	this.cin = cin;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}

}
