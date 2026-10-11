class BankAccount{
    String HolderName;
    int AccountNo;
    double balance;
    BankAccount(String HN,int AN,double B){
        this.HolderName=HN;
        this.AccountNo=AN;
        this.balance=B;
    }
    void display(){
        System.out.println("Previous Balance= "+ balance);
        System.out.println("AccountHolder= "+HolderName);
        System.out.println("Account number= "+AccountNo);
    }
    void withdraw(double withdraw){
        if(withdraw<=balance){
            System.out.println("proceed with the withdrwal");
            balance-=withdraw;
            System.out.println("Balance after withdrawal= "+balance);
        }
    }
    void deposit(double depo){
        balance+=depo;
        System.out.println("Balance after deposit= "+balance);
    }
}
class Main{
    public static void main(String[]args){
        BankAccount B1=new BankAccount("Rhea",4567382,60000);
        B1.display();
        B1.withdraw(50000);
    }
}