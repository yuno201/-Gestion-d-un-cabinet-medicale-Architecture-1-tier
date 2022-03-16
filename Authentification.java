package tp2;

import java.io.*;
public class Authentification {

String l;
BufferedReader f; boolean test = false;
public boolean authdoc(String nu,String ps) {
try {
f = new BufferedReader(new FileReader("D:\\sem4\\architecture log\\tp\\tp2\\logindoc.txt"));  

 l = f.readLine();
while (l != null) {
String[] words = l.split(" ");
if (words[0].equals(nu) && words[1].equals(ps)) 
{ test = true; } 
l = f.readLine();
}
f.close();
if (test == true) { return true;}
else {
	return false;
}
} catch (IOException e) { System.err.println("Erreur: " + e);
}
return false;
}
public static String lireMot(String msg) throws IOException { BufferedReader keyboard;
keyboard = new BufferedReader(new InputStreamReader(System.in)); System.out.print(msg);
return keyboard.readLine();

}
public boolean authsec(String nu,String ps) {
try {
f = new BufferedReader(new FileReader("D:\\sem4\\architecture log\\tp\\tp2\\loginsec.txt"));  

 l = f.readLine();
while (l != null) {
String[] words = l.split(" ");
if (words[0].equals(nu) && words[1].equals(ps)) 
{ test = true; } 
l = f.readLine();
}
f.close();
if (test == true) { return true;}
else {
	return false;
}}
 catch (IOException e) { System.err.println("Erreur: " + e);}
return false;}

public static String lireMot1(String msg) throws IOException { BufferedReader keyboard;
keyboard = new BufferedReader(new InputStreamReader(System.in)); System.out.print(msg);
return keyboard.readLine();

}
}
