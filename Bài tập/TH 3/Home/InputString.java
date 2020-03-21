import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot dong chu: ");
        String s = sc.nextLine();
        System.out.println("Dong vua nhap: " + s);
    }
}
