// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0]; // Shaked
		String name2 = args[1]; // Ori
		String name3 = args[2]; // Nadav 
		double BillAmount = Double.parseDouble(args[3]); // 240 
		double eachCheck = BillAmount / 3;
		double RoundedCheck = Math.ceil(eachCheck);
		System.out.println("Dear " + name3 + " , " + RoundedCheck + " Shekels each." );
		System.out.println("Dear " + name2 + " , " + RoundedCheck + " Shekels each.");
		System.out.println("Dear " + name1 + " , " + RoundedCheck + " Shekels each."); 

		


	    // Replace this comment with the rest of your code   
	}
}
