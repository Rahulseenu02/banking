package banking;

public class Accountd {
    int accNum;
    double accBall;
    String accHolderName;
    Accountd(int accNum,double accBall,String accHolderName){
        this.accNum = accNum;
        this.accBall = accBall;
        this.accHolderName = accHolderName;
    }
    void depositAcc(double amt){
        System.out.println("hi");
    }
    void withdrawAcc(double amt){
        System.out.println("bye");
    }
    final void balanceEnq(){
        System.out.println("this is your acc balance ="+accBall);
    }
}
