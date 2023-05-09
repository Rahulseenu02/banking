package banking;

public class SavingsAcc extends Accountd{
    SavingsAcc(int accNum,double accBall,String accHolderName){
        super(accNum,accBall,accHolderName);
        System.out.println("Savings account created");

    }

    @Override
    void depositAcc(double amt) {
        
        System.out.println("deposit amount is = "+amt);
        accBall = accBall+amt;
        System.out.println("now current balance is = "+ accBall);
    }

    @Override
    void withdrawAcc(double amt) {
        System.out.println("withdraw amount is = "+amt);
        accBall = accBall -amt;
        System.out.println("now your current balance is = "+ accBall);
    }
}
