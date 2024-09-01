import java.util.*;
class Strings1 {
    public static void main(String[] args) {
        String a;//it is stored string pool
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        System.out.println(a);
        //System.out.println(a);
        String b=new String("Hello Welcome");//it is stored in heap memory
        System.out.println(b);
        System.out.println(a==b);//== used for comparing the addresses only
        System.out.println(a=b);
        sc.close();
    }
}
