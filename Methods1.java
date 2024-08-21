public class Methods1 {
    public static void main(String[] args) {
        Methods1 a=new Methods1();
        //System.out.println(a.sum(1,2));
        a.sum(1,2);
    }
    int sum(int a,int b)
    {
       int c=a+b;
       System.out.println(c);
       return c;
    }
}
