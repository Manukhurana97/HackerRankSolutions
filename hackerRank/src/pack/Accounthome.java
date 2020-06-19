package pack;

import java.util.*;

public class Accounthome {

    ArrayList<Account> list  = new ArrayList<>();

    public void add_details(Account acc)
    {
        list.add(acc);
    }
    public void sortlistbybalance()
    {
        System.out.println("before Sorting");
        Iterator<Account> itr = list.iterator();
        while(itr.hasNext())
        {
            Account acc = itr.next();
            System.out.println(acc);
        }

        list.sort(new Account_Bal_comp());

        System.out.println("After Sorting by balance");
        Iterator<Account> itr1 = list.iterator();
        while(itr1.hasNext())
        {
            Account acc1 = itr1.next();
            System.out.println(acc1);
        }
    }

    public void sortlistbyname()
    {
        System.out.println("end by name");
    }

    public static void main(String[] args) {
        Accounthome acc = new Accounthome();
        Scanner sc = new Scanner(System.in);

        Account a = new Account();
        a.setId(1);
        a.setName("abc");
        a.setBalance(101010);
        System.out.println(a.toString());
        acc.add_details(a);

        Account a1 = new Account();
        a1.setId(1);
        a1.setName("abcd");
        a1.setBalance(10010);
        a1.toString();
        acc.add_details(a1);

        Account a2 = new Account();
        a2.setId(1);
        a2.setName("abcde");
        a2.setBalance(10101);
        a2.toString();
        acc.add_details(a2);


        acc.sortlistbybalance();

    }

}
