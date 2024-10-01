public class This {
    int a=100;
    public static void main(String[] args) {
        int a=400;
        This b=new This();
        b.sample();
    }
    void sample(){
         System.out.println(a);
    }
}
