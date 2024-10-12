package abstarction;
abstract class Laptop{
    public void copy(){
        System.out.println("copy code");
    }
    public void cut(){
        System.out.println("cut code");
    }
    abstract public void keyboard();
}
class Lenovo extends Laptop{
    public void keyboard() {
        System.out.println("keyboard code");
    }
    
}
class Example{
    public static void main(String[] args) {
        Lenovo l=new Lenovo();
        l.keyboard();
    }
}
