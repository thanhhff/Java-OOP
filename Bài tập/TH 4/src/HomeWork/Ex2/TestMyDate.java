package HomeWork.Ex2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMyDate {

    public static void main(String[] args) {
//        MyDate obj1 = new MyDate();
//        obj1.hienThi();
//
//        MyDate obj2 = new MyDate(20, 3, 2020);
//        obj2.hienThi();
//
        MyDate obj3 = new MyDate();
        obj3.nhap();
        obj3.hienThi();

//        obj3.hienThiNgayHienTai();
//
//        obj3.hienThiKieuString();
//        obj3.hienThiDinhDang();


        // Compare and Sorting DATE
        String[] date = new String[]{"2020/10/03", "2021/04/16", "2009/05/10", "2017/03/20"};
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
//        Date date1 = dateFormat.parse("2009/12/31");


        DateUtils.compareDate(date[0], date[1]);
    }
}
