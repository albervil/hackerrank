import java.io.*;
import java.util.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();

        int hour = Integer.parseInt(time.substring(0,2));
        String stem = time.substring(2, time.length() -2);
        String format = time.substring(time.length() - 2, time.length());

        if (format.equals("AM")){
            if (hour == 12){
                hour -= 12;
            }
        } else if (format.equals("PM")){
            if (hour != 12){
                hour += 12;
            }
        }

        String formattedHour = Integer.toString(hour);
        if (formattedHour.length() == 1){
            formattedHour = '0' + formattedHour;
        }

        System.out.println(formattedHour+stem);
    }
}
