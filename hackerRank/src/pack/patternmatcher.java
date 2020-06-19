package pack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.*;

public class patternmatcher {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(in.readLine());
        for(int i=0;i<testCases;i++){
            String pattern = in.readLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
