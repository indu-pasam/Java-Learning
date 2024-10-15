public class Prime1ton {
    void checkprime(int n){
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0&&i!=1){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Prime1ton a=new Prime1ton();
        a.checkprime(20);
    }
}
