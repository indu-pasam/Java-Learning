import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        System.out.println("enter a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=a+b;
        System.out.println("result is"+c);
        
        sc.close();
    }
}
