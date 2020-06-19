package pack;

import java.util.Scanner;

public class javaexceptionhandling {
    public static int power(int no, int pow) throws Exception {
        int out = 0;
        for (int i = 0; i < 5; i++) {

            if (no == 0 && pow==0) {
                throw new Exception("n and p should not be zero.");
            }
            else if ( (no>0&&pow<0)  ||no <0  ) {
                throw new Exception("n or p should not be negative.");
            } else if (no >= 0 ) {
                out= ((int) Math.pow(no, pow));
            } else if ( pow<0 ) {
                throw new Exception("n or p should not be negative.");
            }

        }
        return out;
    }

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

//1
//        0
//        java.lang.Exception: n or p should not be negative.
//        java.lang.Exception: n or p should not be negative.
//        java.lang.Exception: n or p should not be negative.
//        15625
//        27
//        1
//        8
//        java.lang.Exception: n or p should not be negative.