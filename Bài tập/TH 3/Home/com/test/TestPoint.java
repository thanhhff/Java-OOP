package com.test;

import com.bean.*;

public class TestPoint {
    public static void main(String[] args) {
        // Goi ham khoi tao khong tham so
        Point obj1 = new Point();
        obj1.hienThi();

        // Goi ham khoi tao 2 tham so
        Point obj2 = new Point(11.1, 22.2);
        obj2.hienThi();

        // Goi ham khoi tao 3 tham so
        Point obj3 = new Point("B", 12.2, 22.2);
        obj3.hienThi();

        Point obj4 = new Point();
        obj4.nhap();
        obj4.hienThi();
    }
}
