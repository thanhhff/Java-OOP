import java.util.Scanner;

public class NhapSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int a = sc.nextInt();

        System.out.println("Nhap so phuc: ");
        float b = sc.nextFloat();

        System.out.println("So da nhap:" + a);
    }
}
