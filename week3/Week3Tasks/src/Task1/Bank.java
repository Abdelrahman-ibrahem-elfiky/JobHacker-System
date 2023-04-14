package Task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    Scanner in=new Scanner(System.in);
    public ArrayList<Account> list =new ArrayList<Account>();

    public void addAccount()
    {
        System.out.println("enter account name");
        String name=in.next();
        Random rand=new Random();
        int accountNumber=rand.nextInt(1000);
        System.out.println("Account Number: "+accountNumber);
        list.add(new Account(name,accountNumber));

    }
    public void depositing()
    {
        System.out.println("Enter account number");
        int number= in.nextInt();
        for (int i = 0; i< list.size(); i++)
        {

            if (list.get(i).getAccountNumber()==number)
            {
                list.get(i).depositing();
            }

        }


    }
    public void withdrawing( )
    {
        System.out.println("Pleas Enter Account Number");
        int number= in.nextInt();
        for (int i = 0; i< list.size(); i++)
        {
            double getNumber= list.get(i).getAccountNumber();
            if (getNumber==number)
            {
                list.get(i).withdrawing();
            }

        }

    }
    public void displayManey()
    {
        System.out.println("Pleas Enter Account Number");
        int number= in.nextInt();
        for (int i = 0; i< list.size(); i++)
        {
            double getNumber= list.get(i).getAccountNumber();
            if (getNumber==number)
            {

                    System.out.println("Name: "+ list.get(i).getAccountName()+
                            "\nAccount Number: "+ list.get(i).getAccountNumber()+
                            "\n balance: "+ list.get(i).getBalance());

                    System.out.printf("Interest rate in this month :%.2f \n ",
                            SavingsAccount.interestBalance(list.get(i).getBalance(),0.60));

                }


            }

        }

}
