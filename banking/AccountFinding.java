package banking;

public class AccountFinding {
    static Accountd accFinding(char type,int accNum ,double accBall,String accHolderName){
        if (type == 's'){
            return new   SavingsAcc(accNum,accBall,accHolderName);
        }
        else if (type == 'C')
        {
            return new craditcardAccount(accNum,accBall,accHolderName);
        }
        else {
            return  null;
        }
    }
}
