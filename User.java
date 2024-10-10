package interfaceconcept;
interface Laptop {
    public void copy();
    public void paste();
    public void cut();
    public void keyboard();
}
class Lenovo implements Laptop{
    public void copy(){
        System.out.println("Lenovo copy method");
    }
    public void paste(){
        System.out.println("Lenovo paste method");
    }
    public void cut(){
        System.out.println("Lenovo cut method"); 
    }
    public void keyboard(){
        System.out.println("Lenovo keyboard method");
    }
}
class Apple implements Laptop{
    public void copy(){
        System.out.println("Apple copy method");
    }
    public void paste(){
        System.out.println("Apple paste method");
    }
    public void cut(){
        System.out.println("Apple cut method");
    }
    public void keyboard(){
        System.out.println("Apple keyboard method");
    }
}
class User{
    public static void main(String[] args) {
    Lenovo a=new Lenovo();
        a.copy();
        a.paste();
        a.keyboard();
    Apple b=new Apple();
        b.copy();
        b.paste();
        b.keyboard();
    }
}

