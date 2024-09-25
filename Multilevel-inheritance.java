class guest{//it has only access to see
    public void read(){
        System.out.println("Read operation");
    }
}
class developer extends guest{//it has access to read and write
    public void write(){
        System.out.println("write operation");
    }
}
class admin extends developer{//it has access to read,write and delete
    public void manage(){
        System.out.println("manages code");
    }
}
public class Multilevelinheri {
    public static void main(String[] args) {
        guest a=new guest();
        a.read();
        developer b=new developer();
        b.read();
        b.write();
        admin c=new admin();
        c.read();
        c.write();
        c.manage();
    }
}
