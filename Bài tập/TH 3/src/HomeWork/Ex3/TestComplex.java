package HomeWork.Ex3;

public class TestComplex {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        obj1.inSoPhuc();

        Complex obj2 = new Complex(4, 2);
        obj2.inSoPhuc();

        // Nhập 2 số phức

        System.out.println("Nhap so phuc thu nhat!");
        Complex soPhuc1 = new Complex();
        soPhuc1.nhapSoPhuc();
        soPhuc1.inSoPhuc();

        System.out.println("Nhap so phuc thu hai!");
        Complex soPhuc2 = new Complex();
        soPhuc2.nhapSoPhuc();
        soPhuc2.inSoPhuc();

        // Tính tổng !
        System.out.println("Tong hai so phuc!");
        Complex sum = Complex.congHaiSoPhuc(soPhuc1, soPhuc2);
        sum.inSoPhuc();

        // Tính hiệu
        System.out.println("Hieu hai so phuc!");
        Complex hieu = Complex.truHaiSoPhuc(soPhuc1, soPhuc2);
        hieu.inSoPhuc();

        // Phép nhân
        System.out.println("Nhân hai so phuc!");
        Complex nhan = Complex.nhanHaiSoPhuc(soPhuc1, soPhuc2);
        nhan.inSoPhuc();

        // Phép chia Nhân
        System.out.println("Chia hai so phuc!");
        Complex chia = Complex.chiaHaiSoPhuc(soPhuc1, soPhuc2);
        if (chia == null) {
            System.out.println("Khong the chia cho 0");
        } else {
            chia.inSoPhuc();
        }

    }
}
