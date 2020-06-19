package pack;
import java.io.*;
import java.util.*;

public class    BalanceBracket {


    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();
        boolean valid=true;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='('||s.charAt(i)=='['|| s.charAt(i)=='{')  // for opening bracket
            {
                stack.push(s.charAt(i));
            }

            else  //   for closing bracket
            {
                if(stack.isEmpty())
                {
                    return "NO";   // closing bracket without opening bracket (inbalanced)
                }

                if((s.charAt(i)==')' && stack.peek()!='(')||(s.charAt(i)==']' && stack.peek()!='[')||(s.charAt(i)=='}' && stack.peek()!='{'))
                {
                    valid=false;
                }
                stack.pop();
            }
        }

        if(stack.isEmpty() && valid)
            return "yes";
        else
            return "no";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            System.out.println(result);
        }



        scanner.close();
    }
}