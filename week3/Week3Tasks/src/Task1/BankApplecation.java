package Task1;

import java.util.Scanner;

public class BankApplecation {
    public static void main(String[]args) {


        Scanner in = new Scanner(System.in);


            Bank bank=new Bank();

        int operation;
        do {
            manager();
            operation= in.nextInt();
            switch (operation)
            {
                case 1:
                {
                    bank.addAccount();
                }break;
                case 2:
                {

                    bank.depositing();
                }break;
                case 3:
                {

                    bank.withdrawing();
                }break;
                case 4:
                {

                    bank.displayManey();
                }break;

            }
        }while (operation!=5);



    }

    public static void manager()
    {
        System.out.println("welcome To Bank..please enter status number ");
        System.out.println("1-Add account");
        System.out.println("2-Depositing");
        System.out.println("3-Withdraw");
        System.out.println("4-Show details");
        System.out.println("5-Exit");

    }

}
