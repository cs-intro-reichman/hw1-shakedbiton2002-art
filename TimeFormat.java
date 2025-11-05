// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
    public static void main(String[] args) {
        String[] parts = args[0].split(":"); //  לא למדנו מפריד את הקלט לשעה ולדקות
        int H = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        
        String period;
        if (H >= 12) {
            period = "PM";
        } else {
            period = "AM";
        }

        
        if (H > 12) {
            H = H - 12;
        }

        if (M < 10) {
            System.out.println(H + ":0" + M + " " + period);
        } else {
            System.out.println(H + ":" + M + " " + period);
        }
    }
}
