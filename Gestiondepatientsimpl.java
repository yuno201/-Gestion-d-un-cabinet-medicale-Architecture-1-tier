package tp2;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Gestiondepatientsimpl implements Gestiondepatients{

BufferedReader bufferedReader=null;
@Override
public void afficherliste(String ListedesPatients) throws IOException  {
try {
FileReader filereader =new FileReader(ListedesPatients);
   bufferedReader= new BufferedReader(filereader);
String line;
while((line=bufferedReader.readLine()) != null) {
System.out.println(line);
}
bufferedReader.close();
}
catch(FileNotFoundException e) {
System.out.println("file not found"+ListedesPatients.toString());
}

}

@Override
public void ajoutpatient(String ListedesPatients,Patient p) throws IOException {
	FileWriter writer=new FileWriter(ListedesPatients,true);
	BufferedWriter bw=new BufferedWriter(writer);
	bw.newLine();
	bw.write("cin:"+p.getCin());
	bw.newLine();
	bw.write("nom:"+p.getNom());
	bw.newLine();
	bw.write("prenom:"+p.getPrenom());
	bw.newLine();
	bw.write("age:"+p.getAge());
	bw.newLine();
	bw.write("adresse:"+p.getAdresse());
	bw.newLine();
	bw.write("tel:"+p.getTel());
	bw.close();
	
}
@Override
public void modifierfiche(String ListedesPatients, String cin, String tel) throws IOException {
	
	      File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\listedespatients2.txt");
	FileReader f=new FileReader(ListedesPatients);
	BufferedReader bf=new BufferedReader(f);
	FileWriter fw = new FileWriter(resultat,true);
	boolean y=true;
	String ch;
	
		while((ch=bf.readLine()) != null) {
			String[] x = ch.split(" ");
				
				if(x[1].equals(cin))  {
					fw.write(ch);
					while((ch=bf.readLine())!=null) {
						x=ch.split(" ");
						if(x[0].equals("Tel:")) {
							if(y==true) {
							
							fw.write("\n"+"Tel: "+tel);
							y=false;
							continue;}
							else {
								fw.write("\n"+ch);
							}
							
							
			            }     
						else {
							fw.write("\n"+ch);
						}
				   }
					}
				else
				{
					fw.write(ch+"\n");
				}
		
	}
		
	fw.close();
	bf.close();
	Files.delete(Paths.get(ListedesPatients));
	File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\ListedesPatients.txt");
	boolean success = resultat.renameTo(r);
	

	}
	 
		
	  
	



@Override
public void supprimerpatient(String ListedesPatients, String cin) throws IOException {
// TODO Auto-generated method stub
	File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\listedespatients3.txt");
	FileReader f=new FileReader(ListedesPatients);
	BufferedReader bf=new BufferedReader(f);
	FileWriter fr=new FileWriter(resultat,true);
	BufferedWriter bw=new BufferedWriter(fr);
	String ch;
	while((ch=bf.readLine())!=null) {
		String[] st = ch.split(" ");
		if(st[1].equals(cin))  {
			while((ch=bf.readLine())!=null) {
				st=ch.split(" ");
				if (st[0].equals("CIN:"))
				{  
					bw.write(ch);
					while((ch=bf.readLine())!=null) {
						bw.newLine();
					bw.write(ch);
				}}
			}
			
	}
		else {
			
			bw.write(ch+"\n");
			
		}
		}
	
	
	bf.close();
	bw.close();
	Files.delete(Paths.get(ListedesPatients));
	File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\ListedesPatients.txt");
	boolean success = resultat.renameTo(r);
}

	}

