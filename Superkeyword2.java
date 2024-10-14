class A{
    public A(){
          System.out.println("In A");
    }
    public A(int n){
        System.out.println(n+"In A");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        //super(n);//for c
        this();
        System.out.println(n +"In B");
    }
}


