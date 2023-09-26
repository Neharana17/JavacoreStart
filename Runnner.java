package sept23.Polymorphism.MehOverLoding;

public class Runnner {
    public static void main(String[] args) {
        new Persion().Speek(1);
        new Persion().Speek(3.15);
        new Persion().Speek(" String");

        Persion p= new Persion();
        p.Speek(4);
        p.Speek(7.85);
        p.Speek(" Another way");
    }
}