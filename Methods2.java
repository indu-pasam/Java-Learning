public class Methods2 {
    static int curramt=30000;
    public static void main(String[] args) {
        greetcustomer();
        Methods2 a=new Methods2();
        a.deposit(10000);
        withdraw(2000);
        getcurrbalance();
    }
    public static void greetcustomer(){
        System.out.println("Hello welcome to the bank");
    }
    void deposit(int amt){
        curramt=curramt+amt;
        System.out.println("the amount deposited is"+curramt);
    }
    static void withdraw(int amt){
        curramt=curramt-amt;
        System.out.println("the amount withdrawn is"+curramt);
    }
    static int getcurrbalance(){
        System.out.println("the total balance is"+curramt);
        return curramt;
    }
}
