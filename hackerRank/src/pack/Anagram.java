package pack;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {

        int count=0;

        if(a.length()!=b.length())
        {
          return false;
        }
        else{
            a = a.toLowerCase();
            b = b.toLowerCase();

            String st1[] = a.split("");
            String st2[] = b.split("");



            java.util.Arrays.sort(st1);
            java.util.Arrays.sort(st2);
            System.out.println(Arrays.toString( st1)+" \n"+ Arrays.toString(st2));

            for(int i=0;i<a.length();i++)
            {
                if(st1[i].equals(st2[i]))
                {
                    count+=1;
                    System.out.println(count+st1[i]+" "+st2[i]);
                }
                else{
                   return false;
                }
            }
        }
        if (count==a.length())
        {
            return true;
        }
       return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
