import javax.swing.JOptionPane;

public class HienThiHaiSo {
    public static void main(String[] args) {
        String strSo1, strSo2;
        String strHienThi = "Ban vua nhap: ";

        strSo1 = JOptionPane.showInputDialog(null,
                "Hay nhap so thu nhat: ",
                "Title: Nhap so thu nhat",
                JOptionPane.INFORMATION_MESSAGE);

        strHienThi += strSo1 + " va ";

        strSo2 = JOptionPane.showInputDialog(null,
                "Hay nhap so thu hai: ",
                "Nhap so thu hai",
                JOptionPane.INFORMATION_MESSAGE);
        strHienThi += strSo2;

        JOptionPane.showMessageDialog(null, strHienThi,
                "Hien thi hai so", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
