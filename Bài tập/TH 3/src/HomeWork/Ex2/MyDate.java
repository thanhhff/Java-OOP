package HomeWork.Ex2;

import javax.swing.*;
import java.util.Calendar;

public class MyDate {
    private int ngay;
    private int thang;
    private int nam;

    // Hàm khởi tạo không tham số
    public MyDate() {

        // Lấy ngày tháng năm hiện tại
        Calendar cal = Calendar.getInstance();
        setNgay(cal.get(Calendar.DAY_OF_MONTH));

        // Chú ý: Month trong Java đếm từ 0
        setThang(cal.get(Calendar.MONTH) + 1);
        setNam(cal.get(Calendar.YEAR));

    }

    // Hàm khởi tạo có 3 tham số ngày, tháng, năm
    public MyDate(int ngay, int thang, int nam) {
        setNgay(ngay);
        setThang(thang);
        setNam(nam);
    }

    public void nhap() {
        String strNgay, strThang, strNam;
        int iNgay, iThang, iNam;

        do {
            strNgay = JOptionPane.showInputDialog(null, "Nhap ngay: ");
            iNgay = Integer.parseInt(strNgay);
        } while (iNgay < 1 || iNgay > 32);

        do {
            strThang = JOptionPane.showInputDialog(null, "Nhap thang: ");
            iThang = Integer.parseInt(strThang);
        } while (iThang < 1 || iThang > 12);

        do {
            strNam = JOptionPane.showInputDialog(null, "Nhap nam: ");
            iNam = Integer.parseInt(strNam);
        } while (iNam < 0);

        setNgay(iNgay);
        setThang(iThang);
        setNam(iNam);
    }

    public void hienThi() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNam(), getThang() - 1, getNgay());

        JOptionPane.showMessageDialog(null,
                ((cal.get(Calendar.DAY_OF_WEEK) == 1 ? "Chu nhat" : "Thu" + cal.get(Calendar.DAY_OF_WEEK)))
                        + ", ngay" + getNgay() + "/" + getThang() + "/" + getNam());
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
