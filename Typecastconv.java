class Typecastconv {
    public static void main(String[] args){
        byte a=2;
        int b=a;
        float c=a;//type conversion
        System.out.println(b);
        System.out.println(c);
        int d=45;
        float h=5.6f;
        byte e=(byte)d;//type casting
        int i=(int)h;
        System.out.println(e);
        System.out.println(i);
        int f=257;
        byte g=(byte)f;//byte range=-128to127 in this int value is large the it perform '%' operation 257%256 
        System.out.println(g);
    }
}
