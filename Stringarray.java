package sept9.Loops.array;

public class Stringarray {
    public static void main(String[] args) {
        String [] fruits= new String[5];
       fruits[0]="Apple";
        fruits[1]="Orange";
        fruits[2]="Banana";
        fruits[3]="Mango";
       System.out.println(fruits.length);
        for(int i=0;i<5;i++){
            System.out.println(fruits[i]);
        }

    }
}
