// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentvalue= Integer.parseInt(args[0]); 
		double rate = Double.parseDouble(args[1]); 
	 	rate = rate/100.0; 
		int n= Integer.parseInt(args[2]); 
		double base = Math.pow(1+rate, n);
		double futurevalue = currentvalue*base;
		System.out.println("After "+ n+ " years, "+  "$" + currentvalue+ " saved at "+ rate*100 +"%"+ " will yield "+ (int) futurevalue+"$");

	}
}