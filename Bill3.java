// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0]; // Shaked
		String name2 = args[1]; // Ori
		String name3 = args[2]; // Nadav 
		double BillAmount = Double.parseDouble(args[3]); // 240 
		double eachCheck = BillAmount / 3;
		System.out.println( name3 + " my check is " + eachCheck );
		System.out.println(name2 + " my check is " + eachCheck);
		System.out.println(name1 + " my check is " + eachCheck); 

		


	    // Replace this comment with the rest of your code   
	}
}
