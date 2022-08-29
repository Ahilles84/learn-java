package lessons;

import java.math.BigInteger;
import java.util.Scanner;

public class ExampleOne {
        public static void main(String[] args){

                int sum = 0;
                for (int i = 1; i <= 200; i++){
                        double value = Math.pow(i, 2);
                        sum *= value;
                }
                System.out.println(sum);
        }
}