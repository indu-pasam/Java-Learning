import java.util.Scanner;
public class Evenorodd1 {
    public static void main(String[] args) {
        int num;
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
         if(num%2==0)
         {
            System.out.println("it is even number");
         }
         else
         {
            System.out.println("it is odd number");
         }
         sc.close();
    }
}
