package banking;

public class mainclass {
    public static void main(String [] args){
      Accountd a1 =AccountFinding.accFinding('s',12454,54000.0,"rahul");
      a1.depositAcc(4000);
      a1.withdrawAcc(1200.0);
        System.out.println("**********************************");
      Accountd a2 = AccountFinding.accFinding('C',45120,45000.0,"LUHAR");
      a2.depositAcc(4500.0);
      a2.withdrawAcc(452000.0);
    }
}
