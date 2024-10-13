class A{
    public void hello(){
        System.out.println("hello");
    }
}
class B extends A{
    public void hello(){
        super.hello();
        System.out.println("hii hello");
    }
    public void bye(){
        this.hello();
        System.out.println("Bye...");
    }
}
class This{
    public static void main(String[] args) {
        B b=new B();
        b.hello();
        b.bye();
    }
}
