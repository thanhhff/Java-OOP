package student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args)
    {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Input GPA: ");
        float gpa = sc.nextFloat();
        student.setGpa(gpa);

        System.out.println("Input Birthday (Format: dd/mm/yyyy): ");

    }
}
