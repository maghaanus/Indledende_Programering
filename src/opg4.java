
public class opg4 {
	
	public static void main(String[] args) {
		
		while (true){
		
		System.out.println("At finde største om mindste tal af tre tal" + '\n');
		
		System.out.println("Skriv det første tal");
		
//De tre tal defineres ind, og kan så regnes videre med	
		
		java.util.Scanner fnumt = new java.util.Scanner(System.in);
		
		double fnum = fnumt.nextDouble();
		
		System.out.println("Skriv det andet tal");
		
		java.util.Scanner snumt = new java.util.Scanner(System.in);
		
		double snum = snumt.nextDouble();
		
		System.out.println("Skriv det tredie tal");
		
		java.util.Scanner tnumt = new java.util.Scanner(System.in);
		
		double tnum = tnumt.nextDouble();

		fnumt.close();
		
//Opskriver de tre tal for brugeren		
		
		System.out.println("De indskrevne tal er som følger " + fnum + " , " + snum + " og " + tnum + '\n');

//Bruger Math.min og Math.max for at finde det mindste og største tal
		
		double min = Math.min(fnum, Math.min(snum, tnum));
		double max = Math.max(fnum, Math.max(snum, tnum));
		
//Printer største og mindste tal
		
		System.out.println("Største tal er " + max + ", mindste tal er " + min + '\n');
		
		System.out.println("- Applikationen vil genstarte -" + '\n');
		
		}
	}
}
