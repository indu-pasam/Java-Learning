class Variables {
    int a=100;//non-static
    static int b=300;//static
    public static void main(String[] args) {
        int c=400;//local var
        Variables v=new Variables();
        System.err.println(v.a);//accessing of instance(non-static variables)
        System.out.println(b);//accessing of static variables
        System.err.println(c);//accessing of local variables
        test(500);
    }
    public static void test(int d)//parameter
    {
        System.out.println(d);//printing of parameter

    }
}
