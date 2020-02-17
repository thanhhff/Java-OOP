import javax.swing.JOptionPane;

public class BaiTap3 {
    public static void main(String[] args) {
        int thang, nam;
        String inputThang, inputNam;

        Boolean check;
        do {
            inputThang = JOptionPane.showInputDialog(null,
                    "Nhap thang: ");

            if (isStringInt(inputThang) == false
                    || Integer.parseInt(inputThang) > 12
                    || Integer.parseInt(inputThang) < 1) {
                check = false;
                JOptionPane.showMessageDialog(null, "Nhap lai gia tri!");
            } else
                check = true;

        } while (check == false);

        do {
            inputNam = JOptionPane.showInputDialog(null,
                    "Nhap nam: ");

            if (isStringInt(inputNam) == false
                    || Integer.parseInt(inputNam) <= 0) {
                check = false;
                JOptionPane.showMessageDialog(null, "Nhap lai gia tri!");
            } else
                check = true;
        } while (check == false);

        thang = Integer.parseInt(inputThang);
        nam = Integer.parseInt(inputNam);

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null,
                        "Thang co 31 ngay!");
                break;
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))
                    JOptionPane.showMessageDialog(null,
                            "Thang co 29 ngay!");
                else
                    JOptionPane.showMessageDialog(null,
                            "Thang co 28 ngay!");
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Thang co 30 ngay!");
                break;
        }
        System.exit(0);

    }

    public static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
