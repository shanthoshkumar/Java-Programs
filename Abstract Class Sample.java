abstract class Bike{
    abstract String brake();
}
class aiyoo extends Bike{
    String brake(){
        return "Aiyoo Poche ";
    }
}
public class Test{
    public static void main(String[] args){
        Bike b=new aiyoo();
        System.out.println(b.brake());
    }
}