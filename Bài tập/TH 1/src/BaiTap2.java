import javax.swing.JOptionPane;

public class BaiTap2 {
    public static void main(String[] args) {
        double number;
        number = 0;
        int check;
        do {
            number += Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Nhap so thuc: ",
                    "Input", JOptionPane.INFORMATION_MESSAGE));
            check = JOptionPane.showConfirmDialog(null,
                    "Co nhap tiep hay khong",
                    "Xac nhan nhap tiep", JOptionPane.INFORMATION_MESSAGE);

            if (check == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,
                        "Tong la: " + number,
                        "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } while (check == JOptionPane.YES_OPTION);
    }
}
