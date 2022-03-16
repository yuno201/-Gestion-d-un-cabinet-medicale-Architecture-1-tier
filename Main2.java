package tp2;

import java.io.IOException;
import java.util.Scanner;

public class Main2 extends GestionDesOrdonnancesimpl{
	public static void main (String[] args) throws IOException {
		String Ordonnance="D:\\sem4\\architecture log\\tp\\tp2\\Ordonnances.txt";
		boolean x=false;
		Scanner imp=new Scanner(System.in);
		System.out.println("saisir le nom d'utilisateur: ");
		String nu=imp.next();
		System.out.println("saisir le mot de passe: ");
		String ps=imp.next();	
		while(x==false) {
		Authentification auth=new Authentification();
		 x=auth.authdoc(nu,ps);}
		System.out.println("saisir un nombre: ");
		Scanner in =new Scanner(System.in);
		String a=in.next();
		
		switch(a) {
		case "1":
			
			GestionDesOrdonnancesimpl obj2=new GestionDesOrdonnancesimpl();
			obj2.afficherlisteord(Ordonnance);
			break;
		case "2":
			String NomPatient,PrenomPatient,NomMedicament,DosageMedicament;
			String NumOrd;
			Scanner sc=new Scanner(System.in);
			System.out.println("saisir le numord: ");
			 NumOrd=sc.next();
			 System.out.println("saisir le nom: ");
			 NomPatient=sc.next();
			 System.out.println("saisir le prenom: ");
			 PrenomPatient=sc.next();
			 System.out.println("saisir le NomMedicament: ");
			 NomMedicament=sc.next();
			System.out.println("saisir le DosageMedicament: ");
			DosageMedicament=sc.next();
			 
			Ordonnance o=new Ordonnance(NumOrd,NomPatient,PrenomPatient,NomMedicament,DosageMedicament);
			GestionDesOrdonnancesimpl obj=new GestionDesOrdonnancesimpl();
			 obj.ajoutord(Ordonnance,o); 
			
			sc.close();
			break;
		case"3":
			Scanner sn=new Scanner(System.in);
			System.out.println("saisir le NumOrd: ");
			NumOrd=sn.next();
			  System.out.println("saisir le NomMedicament: ");
			  NomMedicament=sn.next();
			  GestionDesOrdonnancesimpl obj1=new GestionDesOrdonnancesimpl();
				 obj1.modifierord(Ordonnance,NumOrd,NomMedicament); 
				sn.close();
				break
			;
		case"4":
			Scanner sm=new Scanner(System.in);
			System.out.println("saisir le numord: ");
			  NumOrd=sm.next();
			  GestionDesOrdonnancesimpl obj3=new GestionDesOrdonnancesimpl();
				 obj3.supprimerord(Ordonnance,NumOrd); 
			  sm.close();
			break;
		}
		in.close();
		imp.close();
	}
	

		}


