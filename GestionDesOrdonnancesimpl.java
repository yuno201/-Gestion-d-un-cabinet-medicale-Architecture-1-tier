package tp2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GestionDesOrdonnancesimpl implements GestionDesOrdonnances{
	BufferedReader bufferedReader=null;
	@Override
	public void afficherlisteord(String Ordonnances) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader filereader =new FileReader(Ordonnances);
			   bufferedReader= new BufferedReader(filereader);
			String line;
			while((line=bufferedReader.readLine()) != null) {
			System.out.println(line);
			}
			bufferedReader.close();
			}
			catch(FileNotFoundException e) {
			System.out.println("file not found"+Ordonnances.toString());
			}

	}

	@Override
	public void ajoutord(String Ordonnances,Ordonnance o)throws IOException{
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter(Ordonnances,true);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.newLine();
		bw.write("NumOrd: "+o.getNumOrd());
		bw.newLine();
		bw.write("NomPatient: "+o.getNomPatient());
		bw.newLine();
		bw.write("PrenomPatient: "+o.getPrenomPatient());
		bw.newLine();
		bw.write("NomMedicament: "+o.getNomMedicament());
		bw.newLine();
		bw.write("DosageMedicament: "+o.getDosageMedicament());
		bw.close();
		
	}

	@Override
	public void modifierord(String Ordonnances, String NumOrd, String NomMedicament) throws IOException {
		// TODO Auto-generated method stub
		File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\ordonnances2.txt");
		FileReader f=new FileReader(Ordonnances);
		BufferedReader bf=new BufferedReader(f);
		FileWriter fw = new FileWriter(resultat,true);
		boolean y=true;
		String ch;
		
			while((ch=bf.readLine()) != null) {
				String[] x = ch.split(" ");
					
					if(x[1].equals(NumOrd))  {
						fw.write(ch);
						while((ch=bf.readLine())!=null) {
							x=ch.split(" ");
							if(x[0].equals("NomMedicament:")) {
								if(y==true) {
								
								fw.write("\n"+"NomMedicament: "+NomMedicament);
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
		Files.delete(Paths.get(Ordonnances));
		File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\Ordonnances.txt");
		boolean success = resultat.renameTo(r);
		

		}
	

	@Override
	public void supprimerord(String Ordonnances, String NumOrd)throws IOException {
		// TODO Auto-generated method stub
		File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\Ordonnaces3.txt");
		FileReader f=new FileReader(Ordonnances);
		BufferedReader bf=new BufferedReader(f);
		FileWriter fr=new FileWriter(resultat,true);
		BufferedWriter bw=new BufferedWriter(fr);
		String ch;
		while((ch=bf.readLine())!=null) {
			String[] st = ch.split(" ");
			if(st[1].equals(NumOrd))  {
				while((ch=bf.readLine())!=null) {
					st=ch.split(" ");
					if (st[0].equals("NumOrd:"))
					{  bw.write(ch);
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
		Files.delete(Paths.get(Ordonnances));
		File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\Ordonnances.txt");
		boolean success = resultat.renameTo(r);
	}

	}


