import java.util.Scanner;

public class TinhHaiSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = sc.nextInt();

        System.out.print("Nhap so thu hai: ");
        int b = sc.nextInt();

        int tong = a + b;
        System.out.println("Tong hai so: " + tong);
        System.out.println("Hieu hai so: " + (a - b));
        System.out.println("Tich hai so: " + a * b);

        float thuong = (float) (1.0 * a / b);
        System.out.println("Thuong hai so: " + thuong);
    }
}
