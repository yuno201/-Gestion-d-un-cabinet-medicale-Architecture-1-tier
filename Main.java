package tp2;
import java.io.IOException;
import java.util.Scanner;
public class Main extends Gestiondepatientsimpl {
	public static void main (String[] args) throws IOException {
	String ListedesPatients="D:\\sem4\\architecture log\\tp\\tp2\\ListedesPatients.txt";
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
		
		Gestiondepatientsimpl obj2=new Gestiondepatientsimpl();
	 obj2.afficherliste(ListedesPatients);
		break;
	case "2":
		
		String cin,nom,prenom,adresse;
	String tel;
	int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("saisir le cin: ");
		  cin=sc.next();
		 System.out.println("saisir le nom: ");
		  nom=sc.next();
		 System.out.println("saisir le prenom: ");
		  prenom=sc.next();
		 System.out.println("saisir le adresse: ");
		 adresse=sc.next();
		System.out.println("saisir le tel: ");
		  tel=sc.next();
		 System.out.println("saisir l'age: ");
		 age=sc.nextInt();
		 Patient p=new Patient(cin,nom,prenom,adresse,tel,age);
		 Gestiondepatientsimpl obj=new Gestiondepatientsimpl();
		 obj.ajoutpatient(ListedesPatients,p); 
		 in.close();
		sc.close();
		break;
	case"3":
		Scanner sn=new Scanner(System.in);
	System.out.println("saisir le cin: ");
	  cin=sn.next();
	  System.out.println("saisir le tel: ");
	  tel=sn.next();
	  Gestiondepatientsimpl obj1=new Gestiondepatientsimpl();
		 obj1.modifierfiche(ListedesPatients,cin,tel);
		sn.close();
		break;
	case"4":
		Scanner sm=new Scanner(System.in);
		System.out.println("saisir le cin: ");
		  cin=sm.next();
		  Gestiondepatientsimpl obj3=new Gestiondepatientsimpl();
		  obj3.supprimerpatient(ListedesPatients, cin);
		  sm.close();
		break;
	}
	
}

	}
