package sept23.Inheritance.heriarchical;

public class Runner {
    public static void main(String[] args) {
        Animal a= new Animal();
        a.eat();

        Animal a2= new Dog();
        a2.eat();

        Animal a3= new Cat();
        a3.eat();

        Dog d= new Dog();
        d.bark();


        Cat C= new Cat();
        C.meow();


    }
}
