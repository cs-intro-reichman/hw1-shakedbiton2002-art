// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        
        String[] parts = args[0].split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

       
        String[] periods = {"AM", "PM"};
        String period = periods[hour / 12];

       
        int hour12 = (hour == 0) ? 0 : (hour % 12 == 0 ? 12 : hour % 12);

        
        System.out.printf("%d:%02d %s%n", hour12, minute, period);
    }
}
