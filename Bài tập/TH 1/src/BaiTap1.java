import javax.swing.JOptionPane;
import java.awt.*;

public class BaiTap1 {
    public static void main(String[] args) {
        // ax^2 + bx^2 + c;
        float a, b, c;
        int luaChon;

        luaChon = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Phuong trinh bac (1 hay 2): ",
                "Lua chon loai phuong trinh",
                JOptionPane.INFORMATION_MESSAGE));

        // Phuong tirnh bac 1
        if (luaChon == 1) {

            a = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Nhap he so a: ",
                    "Phuong trinh co dang ax + b = 0",
                    JOptionPane.INFORMATION_MESSAGE));

            b = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Nhap he so b: ",
                    "Phuong trinh co dang ax + b = 0",
                    JOptionPane.INFORMATION_MESSAGE));
            giaiPTBac1(a, b);

        }
        // Phuong trinh bac 2
        else if (luaChon == 2) {
            a = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Nhap he so a: ",
                    "Phuong trinh co dang ax^2 + bx + c = 0",
                    JOptionPane.INFORMATION_MESSAGE));

            b = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Nhap he so b: ",
                    "Phuong trinh co dang ax^2 + bx + c = 0",
                    JOptionPane.INFORMATION_MESSAGE));
            c = Float.parseFloat(JOptionPane.showInputDialog(null,
                    "Nhap he so c: ",
                    "Phuong trinh co dang ax^2 + bx + c = 0",
                    JOptionPane.INFORMATION_MESSAGE));
            giaiPTBac2(a, b, c);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Chua ho tro giai phuong trinh bac khac!");
        }
    }

    public static void giaiPTBac1(float a, float b) {
        if (a == 0) {
            JOptionPane.showMessageDialog(null,
                    "Phuong trinh vo nghiem");
        } else if (a == 0 & b == 0) {
            JOptionPane.showMessageDialog(null,
                    "Phuong trinh co vo so nghiem");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nghiem cua phuong trinh la: " + (-b / a),
                    "Ket qua cua phuong trinh !", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void giaiPTBac2(float a, float b, float c) {

        if (a == 0) {
            giaiPTBac1(b, c);
        }

        float delta = b * b - 4 * a * c;
        float x1;
        float x2;

        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));

            JOptionPane.showMessageDialog(null,
                    "Phuong trinh co 2 nghiem la: " + x1 + " va " + x2,
                    "Ket qua cua phuong trinh !", JOptionPane.INFORMATION_MESSAGE);

        } else if (delta == 0) {
            x1 = (-b / (2 * a));

            JOptionPane.showMessageDialog(null,
                    "Phuong trinh co nghiem kep: " + x1,
                    "Ket qua cua phuong trinh !", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null,
                    "Phuong trinh vo nghiem");
        }
    }
}
