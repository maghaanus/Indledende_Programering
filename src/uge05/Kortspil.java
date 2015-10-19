package uge05;

public class Kortspil {

	public static void main(String[] args) {

		int m = 52;
		int n = 0;
		int f = 0;
		int r = 0;
		
		int kulørtjek = 0;
		int taltjek = 0;
		
		while (n < m){
		
//		int tal = 2;
//		int kulør = 3;

		String k1 = "Hjerter";
		String k2 = "Ruder";
		String k3 = "Klør";
		String k4 = "Spar";

		 int tal = (int) (Math.random() * 13 + 1);
		 int kulør = (int) (Math.random() * 4 + 1);

		 if (tal == taltjek && kulør == kulørtjek){
				kulørtjek = 0;
				taltjek = 0;
				f++;
				n--;
		 }
		 
		switch (tal) {
		case 1: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Es");break;
			case 2:System.out.println(k2 + " Es");break;
			case 3:System.out.println(k3 + " Es");break;
			case 4:System.out.println(k4 + " Es");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 2: {
			switch (kulør) {
			case 1:System.out.println(k1 + " To");break;
			case 2:System.out.println(k2 + " To");break;
			case 3:System.out.println(k3 + " To");break;
			case 4:System.out.println(k4 + " To");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 3: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Tre");break;
			case 2:System.out.println(k2 + " Tre");break;
			case 3:System.out.println(k3 + " Tre");break;
			case 4:System.out.println(k4 + " Tre");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 4: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Fire");break;
			case 2:System.out.println(k2 + " Fire");break;
			case 3:System.out.println(k3 + " Fire");break;
			case 4:System.out.println(k4 + " Fire");break;
			default: System.out.println("Fejl");;
			}
		}
			break;
		case 5: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Fem");break;
			case 2:System.out.println(k2 + " Fem");break;
			case 3:System.out.println(k3 + " Fem");break;
			case 4:System.out.println(k4 + " Fem");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 6: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Seks");break;
			case 2:System.out.println(k2 + " Seks");break;
			case 3:System.out.println(k3 + " Seks");break;
			case 4:System.out.println(k4 + " Seks");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 7: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Syv");break;
			case 2:System.out.println(k2 + " Syv");break;
			case 3:System.out.println(k3 + " Syv");break;
			case 4:System.out.println(k4 + " Syv");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 8: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Otte");break;
			case 2:System.out.println(k2 + " Otte");break;
			case 3:System.out.println(k3 + " Otte");break;
			case 4:System.out.println(k4 + " Otte");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 9: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Ni");break;
			case 2:System.out.println(k2 + " Ni");break;
			case 3:System.out.println(k3 + " Ni");break;
			case 4:System.out.println(k4 + " Ni");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 10: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Ti");break;
			case 2:System.out.println(k2 + " Ti");break;
			case 3:System.out.println(k3 + " Ti");break;
			case 4:System.out.println(k4 + " Ti");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 11: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Eleve");break;
			case 2:System.out.println(k2 + " Eleve");break;
			case 3:System.out.println(k3 + " Eleve");break;
			case 4:System.out.println(k4 + " Eleve");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 12: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Tolv");break;
			case 2:System.out.println(k2 + " Tolv");break;
			case 3:System.out.println(k3 + " Tolv");break;
			case 4:System.out.println(k4 + " Tolv");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		case 13: {
			switch (kulør) {
			case 1:System.out.println(k1 + " Tretten");break;
			case 2:System.out.println(k2 + " Tretten");break;
			case 3:System.out.println(k3 + " Tretten");break;
			case 4:System.out.println(k4 + " Tretten");break;
			default: System.out.println("Fejl");
			}
		}
			break;
		default: System.out.println("Fejl1");
		}
		
		n++;
		r++;
		
		kulørtjek = kulør;
		taltjek = tal;
		
		}
		System.out.println(f);
		System.out.println(n);
		System.out.println(r);
	}
}