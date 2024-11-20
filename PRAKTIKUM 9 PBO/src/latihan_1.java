class OverdraftException extends Exception {
    private final double deficit;

    public OverdraftException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}

class Account {
    protected double balance;

    public Account(double initBalance) {//protected = klo punya dosen
        balance = initBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (amt <= balance) {
            balance = balance - amt;
        } else {
            throw new OverdraftException("Dana Anda tidak cukup",
                    amt - balance);//tulisan ini g cetak
        }
    }
}

public class latihan_1 {
    public static void main(String[] args) {
        Account[] accounts = new Account[2];//100
        accounts[0] = new Account(2000000);
        accounts[1] = new Account(1000000);

        for (int i = 0; i < 2; i++) {
            double b = accounts[i].getBalance();
            System.out.println("Saldo akhir account ke " + i + " = " + b);

            try {
                accounts[i].withdraw(1000000);
            } catch (OverdraftException ode) {
                System.err.println("" + ode);
            }
        }


    }
}
