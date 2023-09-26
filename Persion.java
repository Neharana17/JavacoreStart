package sept23.Polymorphism.MehOverLoding;

public class Persion {

    void Speek(){
        System.out.println(" No Arqument");
    }
    void Speek(int i) {
        System.out.println("Yes  Arqument Integer ="+i);
    }
     void Speek(String i){
         System.out.println("Yes  Arqument String ="+i);
     }
    void Speek(double i){
        System.out.println("Yes  Arqument double = "+i);
    }
}
