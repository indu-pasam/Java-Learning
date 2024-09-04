class Methods {
    public static void main(String args[])
    {
       Methods a=new Methods();
       a.Hello();
       greetings();
    }
    public  void Hello(){//non-static methods thats we created a objects
        System.out.println("Hello Hii");
    }
    public static void greetings(){
        System.out.println("I am fine");
    }

}
