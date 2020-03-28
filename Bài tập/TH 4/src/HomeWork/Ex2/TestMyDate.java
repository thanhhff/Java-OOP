package HomeWork.Ex2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMyDate {

    public static void main(String[] args) {
        MyDate obj1 = new MyDate();
        obj1.hienThi();

        MyDate obj2 = new MyDate(20, 3, 2020);
        obj2.hienThi();

        // Input TEXT
        MyDate obj3 = new MyDate();
        obj3.nhap();
        obj3.hienThi();
        obj3.hienThiKieuString();

        // Hien thi ngay hien tai
        System.out.println("__Hien thi ngay hien tai:");
        MyDate.hienThiNgayHienTai();

        // Compare and Sorting DATE
        String[] date = new String[]{"2020/10/03", "2021/04/16", "2009/05/10", "2017/03/20"};

        // Before Sorting
        System.out.println("Before Sorting: ");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }

        DateUtils.sortingDate(date);

        // After Sorting
        System.out.println("After Sorting: ");
        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
    }
}
