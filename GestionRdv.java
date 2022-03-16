package tp2;

import java.io.IOException;

public interface GestionRdv {
	public void afficherlisterdv(String ListedesRDV)throws IOException ;
	public void ajoutrdv(String ListedesRDV,Rdv r)throws IOException;
	public void modifierrdv(String ListedesRDV,String ID,String heurerdv) throws IOException;
	public void supprimerrdv(String ListedesRDV,String id)throws IOException ;
		
	

}
