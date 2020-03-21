package HomeWork.Ex2;

public class TestMyDate {

    public static void main(String[] args) {
        MyDate obj1 = new MyDate();
        obj1.hienThi();

        MyDate obj2 = new MyDate(20, 3, 2020);
        obj2.hienThi();

        MyDate obj3 = new MyDate();
        obj3.nhap();
        obj3.hienThi();
    }
}
