public class Inheritance {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        BankAccount savingaccount = new SavingAccount();
        System.out.println(savingaccount);

    }

}

class BankAccount{
    static String bankName;
    int BankAccountccountNumber;
    String createdDate;

    public BankAccount(){

    }

    void creation(){

    }
}

class SavingAccount extends BankAccount{
    double intialvalue;
    double interest;
    double balance;

    void deposit(){

    }

    void withdrawal(){

    }
}
