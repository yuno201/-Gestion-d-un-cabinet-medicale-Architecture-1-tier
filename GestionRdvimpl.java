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

public class GestionRdvimpl implements GestionRdv{
	BufferedReader bufferedReader=null;
	@Override
	public void afficherlisterdv(String ListedesRDV) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileReader filereader =new FileReader(ListedesRDV);
			   bufferedReader= new BufferedReader(filereader);
			String line;
			while((line=bufferedReader.readLine()) != null) {
			System.out.println(line);
			}
			bufferedReader.close();
			}
			catch(FileNotFoundException e) {
			System.out.println("file not found"+ListedesRDV.toString());
			}

			}
	

	@Override
	public void ajoutrdv(String ListedesRDV,Rdv r) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer=new FileWriter(ListedesRDV,true);
		BufferedWriter bw=new BufferedWriter(writer);
		bw.newLine();
		bw.write("Id: "+r.getId());
		bw.newLine();
		bw.write("DateRDV: "+r.getDateRDV());
		bw.newLine();
		bw.write("HeureRDV: "+r.getHeureRDV());
		bw.newLine();
		bw.write("CINpatient: "+r.getCIN());
		
		
		
		bw.close();
	}

	@Override
	public void modifierrdv(String ListedesRDV,String Id, String heurerdv) throws IOException {
		// TODO Auto-generated method stub
		
		File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\listedesrdv2.txt");
		FileReader f=new FileReader(ListedesRDV);
		BufferedReader bf=new BufferedReader(f);
		FileWriter fw = new FileWriter(resultat,true);
		boolean y=true;
		String ch;
		
			while((ch=bf.readLine()) != null) {
				String[] x = ch.split(" ");
					
					if(x[1].equals(Id))  {
						fw.write(ch);
						while((ch=bf.readLine())!=null) {
							x=ch.split(" ");
							if(x[0].equals("HeureRDV:")) {
								if(y==true) {
								
								fw.write("\n"+"HeureRDV: "+heurerdv);
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
		Files.delete(Paths.get(ListedesRDV));
		File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\ListedesRDV.txt");
		boolean success = resultat.renameTo(r);
		
	}	 
	

	@Override
	public void supprimerrdv(String ListedesRDV, String id) throws IOException {
		// TODO Auto-generated method stub
		File resultat = new File("D:\\sem4\\architecture log\\tp\\tp2\\listedesRDV3.txt");
		FileReader f=new FileReader(ListedesRDV);
		BufferedReader bf=new BufferedReader(f);
		FileWriter fr=new FileWriter(resultat,true);
		BufferedWriter bw=new BufferedWriter(fr);
		String ch;
		while((ch=bf.readLine())!=null) {
			String[] st = ch.split(" ");
			if(st[1].equals(id))  {
				while((ch=bf.readLine())!=null) {
					st=ch.split(" ");
					if (st[0].equals("Id:"))
						
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
		Files.delete(Paths.get(ListedesRDV));
		File r = new File("D:\\sem4\\architecture log\\tp\\tp2\\ListedesRDV.txt");
		boolean success = resultat.renameTo(r);
	}

		

	}
	

