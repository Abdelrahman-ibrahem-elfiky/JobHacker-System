package Task1;

public class SavingsAccount extends Account{


    public  SavingsAccount()
    {

    }

      public  static  double   interestBalance(double balance,double interestRate)
    {


        double monthlyRate=interestRate/12.0;
        double interest=balance*monthlyRate;
        return interest;



    }
}
