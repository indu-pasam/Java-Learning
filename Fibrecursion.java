/*public class Fibrecursion14 {
    static int n1=0,n2=1,n3=0;
    static void printfib(int count)
    {
        if(count>0)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printfib(count-1);
        }
    }
    public static void main(String[] args) {
        int count=10;
        System.out.print(n1+" "+n2);
        printfib(count-2);
    }
}*/
class Fibrecursion14{
    int n1=0,n2=1,n3;
    int c=10;
    public void fib(){
        //int c=10;
        for(int i=2;i<c;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        
    }
    public static void main(String[] args) {
        Fibrecursion14 a=new Fibrecursion14();
        System.out.print(a.n1+" "+a.n2);
        a.fib();
        //System.out.println(a.fib());
    }
}
