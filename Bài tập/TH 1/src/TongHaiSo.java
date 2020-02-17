import javax.swing.JOptionPane;

public class TongHaiSo {
    public static void main(String[] args) {
        int so1, so2;

        so1 = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Nhap so thu 1:",
                "Nhap so thu nhat!", JOptionPane.INFORMATION_MESSAGE));

        so2 = Integer.parseInt(JOptionPane.showInputDialog(
                null, "Nhap so thu 1:",
                "Nhap so thu nhat!", JOptionPane.INFORMATION_MESSAGE));

        int tong2so = so1 + so2;

        JOptionPane.showMessageDialog(null,
                "Tong hai so " + so1 + " va " + so2 + " la: " + tong2so,
                "Tong hai so", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
