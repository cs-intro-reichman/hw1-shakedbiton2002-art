// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend{
	public static void main(String[] args){
		int lim = Integer.parseInt(args[0]);
		int numberA = (int)(Math.random() * lim);
		int numberB = (int)(Math.random() * lim);
		int numberC = (int)(Math.random() * lim);
		System.out.println(numberA + " " + numberB + " " + numberC);
		int min = Math.min(numberA, Math.min(numberB, numberC));
		int max = Math.max(numberA, Math.max(numberB, numberC));
		int mid = numberA + numberB + numberC - min - max;
		System.out.println(min + " " + mid + " " + max);

	}
}