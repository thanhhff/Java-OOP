import javax.swing.JOptionPane;

public class ShowStar {
    public static void main(String[] args) {
        int height;
        height = Integer.parseInt(JOptionPane.showInputDialog("Nhap chieu cao: "));

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
