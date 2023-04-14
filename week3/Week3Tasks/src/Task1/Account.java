package Task1;

import java.util.Scanner;

public class Account {

    public String accountName;
    public int accountNumber;
    public double balance;
    Scanner in=new Scanner(System.in);
    public Account()
    {

    }
    public Account(String accountName,int accountNumber)
    {
        this.accountName=accountName;
        this.accountNumber=accountNumber;


    }

    public Account(String accountName,int accountNumber,double balance)
    {
        this.accountName=accountName;
        this.accountNumber=accountNumber;
        this.balance =balance;

    }
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositing()
    {
        System.out.println("enter amount");
        double depositMoney= in.nextDouble();
        this.balance+=depositMoney;
        System.out.println("new balance: "+getBalance());
    }
    public void withdrawing()

    {
        System.out.println("Enter the amount");
        double withdrawManey=in.nextDouble();
        if(getBalance()<withdrawManey)
            System.out.println("don't have money in this account");
        else {
            System.out.println("old balance: "+getBalance());
            balance-=withdrawManey;
            System.out.println("new balance: "+getBalance());
        }

    }




}
