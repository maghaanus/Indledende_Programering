
public class opg2 {

	public static void main(String[] args) {
		
		System.out.println("Skriv antallet af dollars der skal væksels");
		
		java.util.Scanner fnumt = new java.util.Scanner(System.in);
		
		double dollar = fnumt.nextDouble();
				
		double euro = (dollar * 0.89) * 0.98;
		
		double kom = (dollar * 0.89) - euro;
		
		if (kom > 0.5){
			System.out.println(dollar + " dollar er " + euro + " Euro");
		}
			else {
				System.out.println("Det valgte beløb er for lille");
		}	
	}
}
