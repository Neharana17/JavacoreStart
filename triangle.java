package Sept3;

public class triangle {
    public static void main(String[] args) {
        int side1=4;
        int side2=8;
        int side3=5;
        if(side1==side2){
            System.out.println("EQ");
        }else if (side1==side3 || side2==side3 || side3==side1){
            System.out.println("Eq");
        }else {
            System.out.println("not Eq");
        }
    }
}
