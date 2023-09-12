package sept9.Loops.array;

import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        System.out.println("Enter an subject");
        Scanner sc = new Scanner(System.in);
        int Total_subject = sc.nextInt();
        int[] marks = new int[Total_subject];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks one by one ");
            marks[i] = sc.nextInt();

        }
       // System.out.println("Hear is your marks");
        for (int i = 0; i < marks.length; i++) ;
        {
int i=0;
            System.out.println("Hear is your marks: " + marks[i]);

        }
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }

        }
        System.out.println("maximum marks is :"+max);
    }
}
