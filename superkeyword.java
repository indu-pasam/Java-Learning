class guest{
    public void read(){
        System.out.println("Read operation");
    }
}
class developer extends guest{//it has access to read and write
    public void write(){
        super.read();//super class is guest
        System.out.println("write operation");
    }
    public void read(){
        System.out.println("Read");
    }
}
class admin extends developer{
    public void manage(){
    super.read();//for this class super is developer
        System.out.println("manages code");
    }
}
class SuperInheri{
    public static void main(String[] args) {
        guest a=new guest();
        a.read();//readoperation
        developer b=new developer();
        b.read();//read
        b.write();//readoperation,writeoperation
        admin c=new admin();
        c.manage();
    }
}
