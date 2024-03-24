package Assignments_and_Quizes.Assignment1;

public class BankAccount {
    private int balance;
    private String accountNumber;

    public BankAccount(String accountNumber,int amount) {
        if (amount < 1000) {
            System.out.printf("Can not create account: %s ",accountNumber);
            System.out.println("The minimum amount required to create an account is Rs 1000.");
            return;
        } else {

            this.balance = amount;
            this.accountNumber = accountNumber;
        }
    }

    public void deposit(int amount){
        if (this.accountNumber == null){
            showNoAccountError();
            return;
        }
        if (amount <= 100000){
            this.balance += amount;
            System.out.printf("Rs %d deposited into %s.\n",amount,this.accountNumber);
        }

        System.out.printf("The new balance for %s is Rs %d \n",this.accountNumber,this.balance);
    }

    public void withdraw(int amount){
        if (this.accountNumber == null){
            showNoAccountError();
            return;
        }
        if (amount >= this.balance || amount <= 0){
            System.out.println("Can not withdraw Rs" + amount+", on your balance of Rs" + this.balance);
            return;
        }
        if (balance < 1000){
            this.balance -= 25;
            this.balance -= amount;
            System.out.printf("Rs %d withdrawn from %s.\n",amount,this.accountNumber);
            System.out.printf("Rs 25 deducted from your account (%s) for low balance\n",this.accountNumber);
            System.out.printf("The new balance for %s is Rs %d \n",this.accountNumber,this.balance);
            return;
        }
        this.balance -= amount;
        System.out.printf("Rs %d withdrawn from %s.\n",amount,this.accountNumber);
        System.out.printf("The new balance for %s is Rs %d \n",this.accountNumber,this.balance);
    }

    public int showBalance(){
        if (this.accountNumber == null){
            return 0;
        }
        return this.balance;
    }
    public String getAccNumber(){
        if (this.accountNumber == null){
            return "No such account exist";
        }
        return this.accountNumber;
    }

    public void showNoAccountError(){
        System.out.println("Please create an account first with a deposit of minimum Rs 1000");
        return;
    }


}
