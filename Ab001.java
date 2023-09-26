package sept23.Abstration.Exp2;

public class Ab001 {
    public static void main(String[] args) {

    }
}
abstract  class persion{
    abstract  void say();
}
class Student extends  persion{

    @Override
    void say() {
        System.out.println(" I am say from student");
    }
}
