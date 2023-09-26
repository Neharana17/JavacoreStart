package sept23.Abstration.Exp2;

public class Ab003 {
    public static void main(String[] args) {
          staticDemo.m1();
          new p().m2();
    }
}
abstract class staticDemo{
    int a=10;
    static  void m1(){
        System.out.println(" static");
    }
    void m2(){
        System.out.println("m2");
    }
}
class p extends staticDemo{

}