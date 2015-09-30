import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class ExtraLongFactorials {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int number = sc.nextInt();
      BigInteger result = BigInteger.ONE;

      for (int i = number; i > 0; i--){
        result = result.multiply(new BigInteger(Integer.toString(i)));
      }

      System.out.println(result);
    }
}
