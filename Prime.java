/*public class Prime15 {
    public static void main(String[] args) {
        int n=10;
        int count=0;
        if(n==0||n==1){
            System.out.println("not prime");
        }
        else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("not");
            }
        }
    }
}*/
/*class Prime15{
    public static void main(String[] args) {
        int n=7;
        int flag=0;
        int m=n/2;
        if(n==0||n==1){
            System.out.println("not prime");
        }
        else{
            for(int i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println("not");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("prime");
            }
        }
    }
}*/
                                        //using methods
class Prime15{
    public void checkprime(int n){
        int count=0;
        if(n==0||n==1){
            System.out.println("not prime");
        }
        else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("not");
            }
        }
    }
    public static void main(String[] args) {
        Prime15 a=new Prime15();
        a.checkprime(17);
    }
}
