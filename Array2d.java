import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        int a[][]=new int[3][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array ele ");
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
            a[i][j]=sc.nextInt();
           }
        }
        System.out.println("array elements are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

