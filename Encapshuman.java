package encapsulation;
class Sample {
    public int age=30;
    public String name="Harry";
    public int getage(){
         return age;
    }
    public String getname(){
        return name;
    }
}
class Encapshuman{
    public static void main(String[] args) {
    Sample s=new Sample();
    System.out.println(s.getage()+" : "+s.getname());
    }
}
