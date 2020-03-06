package onClass;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------");

        for (int i = 0; i < height; i++) {
            for (int k = height - 1; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
