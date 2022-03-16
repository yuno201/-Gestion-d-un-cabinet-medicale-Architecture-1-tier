package tp2;

import java.io.IOException;
import java.util.Scanner;

public class Main3 {
	public static void main (String[] args) throws IOException {
		String ListedesRDV="D:\\sem4\\architecture log\\tp\\tp2\\ListedesRDV.txt";
		boolean x=false;
		Scanner imp=new Scanner(System.in);
		System.out.println("saisir le nom d'utilisateur: ");
		String nu=imp.next();
		System.out.println("saisir le mot de passe: ");
		String ps=imp.next();	
		while(x==false) {
		Authentification auth=new Authentification();
		 x=auth.authsec(nu,ps);}
		System.out.println("saisir un nombre: ");
		Scanner in =new Scanner(System.in);
		String a=in.next();
		
		switch(a) {
		case "1":
			
			GestionRdvimpl obj2=new GestionRdvimpl();
		 obj2.afficherlisterdv(ListedesRDV);
			break;
		case "2":
			String Id;
			String DateRDV,HeureRDV,cin;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("saisir le ID: ");
			  Id=sc.next();
			 System.out.println("saisir la dateRDV: ");
			  DateRDV=sc.next();
			 System.out.println("saisir l'heureRDV: ");
			 HeureRDV=sc.next();
			System.out.println("saisir le cin: ");
			  cin=sc.next();
			 Rdv r=new Rdv(Id,DateRDV,HeureRDV,cin);
			 GestionRdvimpl obj=new GestionRdvimpl();
			 obj.ajoutrdv(ListedesRDV,r); 
			 in.close();
			sc.close();
			break;
		case"3":
			String heurerdv;
			Scanner sn=new Scanner(System.in);
		System.out.println("saisir le id: ");
		  Id=sn.next();
		  System.out.println("saisir l'heureRDV: ");
		  heurerdv=sn.next();
		  GestionRdvimpl obj1=new GestionRdvimpl();
			 obj1.modifierrdv(ListedesRDV,Id,heurerdv);
			sn.close();
			break;
		case"4":
			Scanner sm=new Scanner(System.in);
			System.out.println("saisir le Id: ");
			  Id=sm.next();
			  GestionRdvimpl obj3=new GestionRdvimpl();
			  obj3.supprimerrdv(ListedesRDV, Id);
			  sm.close();
			break;
		}
		
	}

		}


