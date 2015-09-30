import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee;

        int delivery_day = sc.nextInt();
        int delivery_month = sc.nextInt();
        int delivery_year = sc.nextInt();

        int exp_day = sc.nextInt();
        int exp_month = sc.nextInt();
        int exp_year = sc.nextInt();

        if (delivery_year > exp_year){
            fee = 10000;
        } else if ((delivery_year == exp_year) && (delivery_month > exp_month)){
            fee = (delivery_month - exp_month) * 500;
        } else if ((delivery_year == exp_year) && (delivery_month == exp_month) && (delivery_day > exp_day)){
            fee = (delivery_day - exp_day) * 15;
        } else {
            fee = 0;
        }

        System.out.println(fee);
    }
}
