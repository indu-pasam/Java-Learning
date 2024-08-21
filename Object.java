class Object{
    int a=10;
    public  static void main(String[] args) {
        Object b=new Object();//Accsing of non-static fields
        hello();//accessing of static fields
        System.out.println(b.a);
    }
    public static void hello(){
        System.out.println("Hello");
    }
}
