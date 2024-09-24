import java.util.Scanner;
public class Array1d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        System.out.print("Give the array elements");
        for(int i=0;i<a.length;i++)
        { 
           a[i]=sc.nextInt();
        }
        System.out.println("the array elements are");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
