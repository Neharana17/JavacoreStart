package sept9.Loops.array;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] array= new int[n];
        for(int i=1; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
