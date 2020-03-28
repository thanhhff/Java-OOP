package HomeWork.Ex2;

import javax.swing.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

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
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhap ngay: ");
            strNgay = sc.nextLine();
            iNgay = setNgay(strNgay);
        } while (iNgay < 1 || iNgay > 32);

        do {
            System.out.println("Nhap thang: ");
            strThang = sc.nextLine();
            iThang = setThang(strThang);
        } while (iThang < 1 || iThang > 12);

        do {
            System.out.println("Nhap nam: ");
            strNam = sc.nextLine();
            iNam = setNam(strNam);
        } while (iNam < 0);

        setNgay(iNgay);
        setThang(iThang);
        setNam(iNam);
    }

    public void hienThi() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNam(), getThang() - 1, getNgay());

        System.out.println(((cal.get(Calendar.DAY_OF_WEEK) == 1 ? "Chu nhat" : "Thu" + cal.get(Calendar.DAY_OF_WEEK)))
                + ", ngay: " + getNgay() + "/" + getThang() + "/" + getNam());
    }

    public void hienThiKieuString() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNam(), getThang() - 1, getNgay());
        String month = new DateFormatSymbols().getMonths()[getThang() - 1];

        String day = "NULL";
        String[] dayOfMonth = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thiry-first"};
        for (int i = 0; i < dayOfMonth.length; i++) {
            int j = i + 1;
            if (j == getNgay()) {
                day = dayOfMonth[i];
                break;
            }
        }
        System.out.println(day + " " + month + " " + getNam());
    }

    public void hienThiDinhDang() {
        System.out.println("Dinh dang kieu MM/dd/yyyy: " + getThang() + "/" + getNgay() + "/" + getNam());
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int setNgay(String ngay) {
        String[] dayOfMonth = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first", "twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", "twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thiry-first"};
        for (int i = 0; i < dayOfMonth.length; i++)
            if (ngay.equalsIgnoreCase(dayOfMonth[i])) {
                return this.ngay = i + 1;
            }
        return 0;
    }

    public int getThang() {
        return thang;
    }

    public int setThang(String thang) {
        String[] monthOfYear = new String[]{"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        for (int i = 0; i < monthOfYear.length; i++) {
            if (thang.equalsIgnoreCase(monthOfYear[i])) {
                return this.ngay = i + 1;
            }
        }
        return 0;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public int setNam(String nam) {
        switch (nam) {
            case "twenty twenty":
                return this.nam = 2020;
            case "twenty nineteen":
                return this.nam = 2019;
            case "twenty eighteen":
                return this.nam = 2018;
            case "twenty seventeen":
                return this.nam = 2017;
            default:
                break;
        }
        return 0;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
}
