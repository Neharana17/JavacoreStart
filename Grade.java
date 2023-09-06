package Sept3;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = sc.nextInt();
        char grade = 0;
        if (score >= 90 && score <= 100) {
            grade = 'A';

        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 50 && score < 60) {
            grade = 'F';
        }
        else{
            grade='r';
        }

        System.out.println("Your grade is :" + grade);
    }


}
