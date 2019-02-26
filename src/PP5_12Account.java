import java.text.NumberFormat;

public class PP5_12Account {

    private final double RATE = 0.035;

    private String name;
    private long acctNumber;
    private double balance;

    public PP5_12Account(String owner, long account, double initial){
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public PP5_12Account(String owner, long account){
        name = owner;
        acctNumber = account;
        balance = 0;
    }

    public double deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
        }
        return balance;
    }

    public double withdraw(double amount, double fee){
        if(amount+fee > 0 && amount +fee <balance){
            balance = balance - amount - fee;
        }
        return balance;
    }

    public double addInterest(){
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (acctNumber + "\t" + name + "\t" + fmt.format( balance ));
    }

}

