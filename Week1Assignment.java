
public class Week1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculations for weighted test average score
				double T1 = 75 * 0.10, T2 = 95 * 0.20, T3 = 85 * 0.25;
				double T4 = 55 * 0.25, T5 = 65 * 0.10, T6 = 75 * 0.10;
				double Tsum = T1 + T2 + T3 + T4 + T5 + T6;
						System.out.println("The weighted test average is: " + Tsum );
				
				//Calculations for weighted assignment scores
				double A1 = 55 * 0.05, A2 = 65 * 0.10, A3 = 65 * 0.15;
				double A4 = 60 * 0.25, A5 = 55 * 0.25, A6 = 50 * 0.20;
				double Asum = A1 + A2 + A3 + A4 + A5 + A6;
						System.out.println("The weighted assignment average is: " + Asum );
						
				//Calculation for master average
				double Mave = (Tsum + Asum) / 2;
						System.out.println("The master average is: " + Mave);
				
	}

}
