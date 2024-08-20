public class Swap2 {
    public static void main(String[] args) {
        int a=10;int b=3;//swapping without using temp var
        System.out.println("before swapping" + "a:"+a+" "+"b:"+" "+b);
        a=a-b;//7
        b=a+b;//7+3=10
        a=b-a;//10-7=3
        System.out.println("after swapping" + "a:"+a+" "+"b:"+" "+b);
    }
}
