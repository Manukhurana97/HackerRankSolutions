package pack;

public class Account {

    public String name;
    public int id;
    public long balance;

    public int getId() {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String Name)
    {
        this.name=name;
    }

    public long getBalance()
    {
        return balance;
    }
    public void setBalance(long balance)
    {
        this.balance=balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
