package pack;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    // calculating gcd
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // calculating lcm
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a, b);
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        // calculating Lcm
        int ax = a.get(0);
        for(int i=0;i<a.size();i++)
        {
            ax = lcm(ax, a.get(i));
        }

        // calculating gcd
        int bx = b.get(0);
        for(int j=0;j<b.size();j++)
        {
            bx = gcd(bx, b.get(j));

        }

        List<Integer> list = new ArrayList<>();

        int temp=ax;

        while(temp<=bx)
        {
            list.add(temp);
            temp+=ax;

        }

        int counter=0;
        for(int f: list)
        {
            boolean n=true;
            for(int g: b)
            {
                if(g%f!=0)
                {
                    n=false;
                    break;
                }
            }
            if(n)
            {
                counter+=1;
            }
        }

        return counter;

    }

}


public class Between2set {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        System.out.println(total);
    }
}
