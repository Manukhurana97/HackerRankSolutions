package pack;

import java.util.Comparator;

public class Account_Bal_comp implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Account a1 = (Account) o1;
        Account a2 = (Account) o2;

        if (a1.balance == a2.balance)
            return 0;
        else if (a1.balance > a2.balance)
            return 1;
        else
            return -1;
    }
}
