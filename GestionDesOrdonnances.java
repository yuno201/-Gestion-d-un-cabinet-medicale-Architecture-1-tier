package tp2;

import java.io.IOException;

public interface GestionDesOrdonnances {
	public void afficherlisteord(String Ordonnances) throws IOException;
	public void ajoutord(String Ordonnances,Ordonnance o)throws IOException;
	public void modifierord(String Ordonnances,String NumOrd ,String medicament) throws IOException;
	public void supprimerord(String Ordonnances,String NumOrd)throws IOException ;
		
	
}
