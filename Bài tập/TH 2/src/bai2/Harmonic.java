package bai2;

import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap gia tri: ");
        int n = sc.nextInt();
        if (n < 0)
            System.exit(0);
        double harmonic = 0;
        for (int i = 1; i <= n; i++){
            harmonic += (1.0 * 1) / i;
        }

        System.out.println("Harmonic: " + harmonic);

        /**
         * Java doc
         */

    }
}
