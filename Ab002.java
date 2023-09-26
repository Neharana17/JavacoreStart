package sept23.Abstration.Exp2;

public class Ab002 {
    public static void main(String[] args) {


    }


}
 abstract class persion2{
    abstract void say();

    void eat(){
        System.out.println(" eat from persion");
    };
 }

 class  Student1 extends persion2{

     @Override
     void say() {
         System.out.println("Student eat()" );
     }
 }
