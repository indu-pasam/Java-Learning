class Methodoverloading{
    public static void main(String[] args) {
        Methodoverloading a=new Methodoverloading();
        a.sum(30, 10);
        a.sum(10,20,30);
    }
    int sum(int a,int b)
    {
        System.out.println(a+b);
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
        return a+b+c;
    }
}