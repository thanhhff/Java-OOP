package com.bean;

import javax.swing.*;

public class Point {
    private String tenDiem;
    private double tungDo;
    private double hoanhDo;


    // Hàm khởi tạo không có tham số.
    public Point() {
        setTenDiem("A");
        setTungDo(0.0);
        setHoanhDo(0.0);
    }

    // Hàm khởi tạo có 2 tham số tung độ và hoành độ.
    public Point(double tung, double hoanh) {
        setTenDiem("Noname");
        setTungDo(tung);
        setHoanhDo(hoanh);
    }

    // Hàm khởi tạo có 3 tham số.
    public Point(String ten, double tung, double hoanh) {
        setTenDiem(ten);
        setTungDo(tung);
        setHoanhDo(hoanh);
    }

    public void setTenDiem(String ten) {
        this.tenDiem = ten;
    }

    public void setTungDo(double tung) {
        this.tungDo = tung;
    }

    public void setHoanhDo(double hoanh) {
        this.hoanhDo = hoanh;
    }

    public String getTenDiem() {
        return this.tenDiem;
    }

    public double getTungDo() {
        return this.tungDo;
    }

    public double getHoanhDo() {
        return this.hoanhDo;
    }


    public void nhap() {
        String strTenDiem, strTung, strHoanh;
        double dTung, dHoanh;

        strTenDiem = JOptionPane.showInputDialog(null,
                "Nhap ten diem: ",
                "NHẬP TÊN ĐIỂM", JOptionPane.INFORMATION_MESSAGE);
        setTenDiem(strTenDiem);

        strTung = JOptionPane.showInputDialog(null,
                "Nhap tung do: ",
                "NHẬP TUNG ĐỘ ", JOptionPane.INFORMATION_MESSAGE);
        dTung = Double.parseDouble(strTung);
        setTungDo(dTung);

        strHoanh = JOptionPane.showInputDialog(null,
                "Nhap hoanh do: ",
                "NHẬP HOÀNH ĐỘ ", JOptionPane.INFORMATION_MESSAGE);
        dHoanh = Double.parseDouble(strHoanh);
        setHoanhDo(dHoanh);
    }

    public void hienThi() {
        JOptionPane.showMessageDialog(null,
                "Point: " + getTenDiem() + "(" + getTungDo() + "," + getHoanhDo() + ")");
    }
}
