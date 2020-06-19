package pack;


import java.util.Arrays;
import java.util.Scanner;

public class Timeconversion {
    static String timeConversion(String s) {

        String[] time = s.split(":");
        char seconds[]=time[2].toCharArray();
       if(time[2].contains("PM"))
       {
           int temp = Integer.parseInt(time[0]);
           if(temp!=12)
               temp+=12;
           return temp+":"+time[1]+":"+seconds[0]+seconds[1];
       }
       else{
           int temp1 = Integer.parseInt(time[0]);
           if(temp1==12)
           {
               temp1=00;
           }
           return "0"+temp1+":"+time[1]+":"+seconds[0]+seconds[1];
       }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args)  {


        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);

    }

}
