// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		double startinginvestment = Double.parseDouble(args[0]);
		double precentincrease = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		double FinalAmount = startinginvestment * Math.pow(1 + precentincrease / 100 , years);
		System.out.println("After " + (int)years + " years , $" + (int)startinginvestment + " saved at " + precentincrease +  "% will yield $" + ((int)FinalAmount));

	}

	}
