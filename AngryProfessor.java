import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
      
        for (int i=0; i<t; i++){
            int count = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int j=0; j<n; j++){
                if (sc.nextInt() <= 0){
                    count++;
                }
            }

            if (count < k){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
