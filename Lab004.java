package Sept3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        System.out.println(" Enter the value os a, b ,c \n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Your inputs are " + a + " " + b + " " + c);

        if (a > b && a > c) {
            System.out.println("max is " + a);
        }
        if (b > a && b > c) {
            System.out.println("max is " + b);
        }
        if (c > a && c > b) {
            System.out.println("max is " + c);

        }
    }
}
