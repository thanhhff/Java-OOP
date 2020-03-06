package onClass;

import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        System.out.println("Tong cua hai so la: " + (a + b));

        System.out.println("Thuong hai so la: " + (float) (1.0 * a / b));

        System.out.println("Hieu hai so la: " + (a - b));

        System.out.println("Tich hai so la: " + a * b);
    }
}
