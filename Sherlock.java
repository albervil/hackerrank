import java.io.*;
import java.util.*;

public class Sherlock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String solution = new String();

        int t = sc.nextInt();
      
        for (int i=0; i<t; i++){
            int size = sc.nextInt();

            int fives = -1;
            int rem = size % 3;

            int x = size - rem;

            while((fives == -1) && x >= 0){
                if ((size - x)%5 == 0){
                fives = x;
                } else {
                    x = x - 3;
                }
            }

            if (fives == -1){
                solution = "-1";
            } else {
                final char[] array5 = new char[fives];
                final char[] array3 = new char[size - fives];
                Arrays.fill(array5, '5');
                Arrays.fill(array3, '3');
                solution = new String(array5) + new String(array3);
            }
            System.out.println(solution);
        }
    }
}
