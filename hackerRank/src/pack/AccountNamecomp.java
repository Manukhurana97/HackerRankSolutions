package pack;

import java.util.Comparator;

public class AccountNamecomp implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Account a1 = (Account) o1;
        Account a2 = (Account) o2;

        return a1.name.compareTo(a2.name);
    }
}
