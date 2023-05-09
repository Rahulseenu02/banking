package banking;

public class craditcardAccount extends  Accountd{
    craditcardAccount(int accNum,double accBall, String accHolderName){
        super(accNum,accBall,accHolderName);
        System.out.println("credit card account created ");
    }

    @Override
    void depositAcc(double amt) {
        System.out.println("account holder name is "+accHolderName);
        System.out.println("deposit amount is = "+ amt);
        accBall = accBall - amt;
        System.out.println("now your current balance is ="+ accBall);
    }

    @Override
    void withdrawAcc(double amt) {
        System.out.println("withdraw amount is = "+ amt);
        accBall = accBall + amt;
        System.out.println("now your current balance is ="+ accBall);

    }
}
