import java.math.BigInteger;
import java.util.Scanner;

public class Numere_ex2 {
public static void main (String[] args ) {
	
	/// ex 6.2 
	int i = Integer.parseInt("15");
	System.out.println(i);
	
	String s = String.valueOf(70);
	System.out.println(s);
	
	float n = Float.parseFloat("12.565643");
	System.out.println(n);
	
	float a = 1.2f;
	System.out.println(a);
	System.out.println("\n");
	
	
	
	/// ex 6.3 
	int b = Integer.MAX_VALUE;
	System.out.println(b);
	//b++;
	System.out.println(b+1);
	
	int c = Integer.MIN_VALUE;
	System.out.println(c);
	System.out.println(c-1);
	System.out.println("\n");
	
	
	float d = Float.MAX_VALUE;
	System.out.println(d);
	System.out.println((d+d)-(d+d));
	
	float e = 2.8f + 0.17f;
	System.out.println(e);
	
	// 6.4 
	
	System.out.println("\n");
	int f = 56;
	//System.out.println(f/0);
	double total = 0;
	total += 5.6;
	total += 5.8;
	System.out.println(total);
	
	
	float g = -13.5f;
	float h = 13.5f;
	System.out.println(g/0);
	System.out.println(h/0);
	
	System.out.println( (d+d) * (-(d+d)) );
	//boolean i = 12;
	
	
	int j = (int)13.67f;
	System.out.println(j);
	
	
	// 6.5 
	
	String nume; // Declara o variabila pentru nume.
	
	 Scanner in = new Scanner(System.in);
	 
	 //... Scrie o explicatie si citeste intrarea
	 System.out.println("Care e numele tau, prietene?");
	 
	 nume = in.nextLine(); // Citeste o linie de la consola.
	 //... Afiseaza linia citita inainte
	 System.out.println("Du-ma la seful vostru, " + nume);
	 
	 //... Citeste un intreg si apoi in afiseaza
	System.out.println("Introduceti un intreg: ");
	int val = in.nextInt();
	System.out.println("Numarul de tip intreg citit este: " + val );
	
	 //... Citeste un numar real si apoi in afiseaza
	float fa;
	System.out.println("Introduceti un numar real: ");
	fa = in.nextFloat();
	System.out.println("Numarul de tip float citit este: " + fa);
	
	//... Inchiderea citirii prin intermediul Scanner
	in.close();
	
	
	// 6.6 
	
	BigInteger value = BigInteger.TWO.pow(64).subtract(BigInteger.ONE);
	System.out.println(value);
	
	
	}
}
