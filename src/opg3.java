
public class opg3 {
	
	public static void main(String[] args) {
		
	
		
		System.out.println("Skriv brevets vægt");
		
		java.util.Scanner fnumt = new java.util.Scanner(System.in);
		
		Double mass = fnumt.nextDouble();

//Hvis man ved fejl har skrevet en vægt der er 0 eller under, vil den advare om dette		
		
		if (mass <= 0) System.out.println("Brevet skal have en masse for at kunne sendes");
		
//En masse if statements skrives op, hvis en af dem passer på brevet, vil den printe hvad der står i System.out.println				
		
		if (mass > 0 && mass <= 50) System.out.println("Portoen for et brev med vægten " + mass + " gram er 7 kr");
		if (mass > 50 && mass <= 100) System.out.println("Portoen for et brev med vægten " + mass + " gram er 14 kr");
		if (mass > 100 && mass <= 250) System.out.println("Portoen for et brev med vægten " + mass + " gram er 24 kr");
		if (mass > 250 && mass <= 500) System.out.println("Portoen for et brev med vægten " + mass + " gram er 33 kr");
		if (mass > 500 && mass <= 1000) System.out.println("Portoen for et brev med vægten " + mass + " gram er 44 kr");
		if (mass > 1000 && mass <= 2000) System.out.println("Portoen for et brev med vægten " + mass + " gram er 55 kr");
		double diff = mass - 2000;
		
//Hvis man ved fejl har skrevet en vægt der er over 2000 gram, vil den advare om dette		
		
		if (mass > 2000) System.out.println("Brevet er " + diff + " gram for tungt, i forhold til det 2000 gram max, og kan derfor ikke sendes, som brev.");
	}
}
