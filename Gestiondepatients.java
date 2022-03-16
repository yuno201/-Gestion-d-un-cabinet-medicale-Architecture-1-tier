package tp2;

import java.io.IOException;

public interface Gestiondepatients {
	public void afficherliste(String ListedesPatients) throws IOException ;
	public void ajoutpatient(String ListedesPatients,Patient p)throws IOException ;
	public void modifierfiche(String ListedesPatients,String cin,String tel)throws IOException ;
	public void supprimerpatient(String ListedesPatients,String cin)throws IOException ;
		
	

}
