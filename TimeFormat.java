// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
        
        String[] parts = args[0].split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        
        String[] periods = {"AM", "PM"};
        String period = periods[hour / 12];

        
        int[] hours12 = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int hour12 = hours12[hour % 12];

        
        System.out.printf("%d:%02d %s%n", hour12, minute, period);
    }
}

		

