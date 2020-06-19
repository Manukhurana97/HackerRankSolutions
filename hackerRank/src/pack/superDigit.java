package pack;

import java.io.*;
import java.util.*;

public class superDigit {



    static String sum(String data)
    {
        int add=0;
        for(int i=0;i<data.length();i++)
            add+=(int) data.charAt(i)-48;

        return String.valueOf(add);
    }


    static int superDigit(String n, int k) {

        // repeat the String N number of times
        String rep = new String(new char[k]).replace("\0", n);

        while (rep.length()!=1)
            rep = sum(rep);

        System.out.println();
        return Integer.parseInt(rep);
    }




//    static int superDigit(String n, int k) {
//
//        // repeat the String N number of times
//        String rep = new String(new char[k]).replace("\0", n);
//        int data = Integer.parseInt(rep);
//        int sum = 0;
//        while (data<=9)
//        {
//            sum += data%10;
//            data = data/10;
//        }
//
//
//
//        return data;
//    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
