
public class opg1 {

	public static void main(String[] args) {
		
		java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

		System.out.println("Skriv din alder herunder og tryk retur:");
		int alder;
		alder = tastatur.nextInt();                     // læs et tal fra tastaturet

		if (alder >= 18) {
			System.out.print("Du er myndig. ");
			System.out.println("Du må købe stærk alkohol og tobak");
		}

		if (alder < 18) System.out.println("Du er ikke myndig");
		if (alder > 16) System.out.println("Du må købe svag alkohol");

		System.out.println("Du er " + alder + " år.");
	}

}
