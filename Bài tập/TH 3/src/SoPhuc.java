import sophuc.Complex;

public class SoPhuc {
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
        Complex sum = soPhuc1.congHaiSoPhuc(soPhuc2);
        sum.inSoPhuc();

        // Tính hiệu
        System.out.println("Hieu hai so phuc!");
        Complex hieu = soPhuc1.truHaiSoPhuc(soPhuc2);
        hieu.inSoPhuc();

        // Phép nhân
        System.out.println("Nhân hai so phuc!");
        Complex nhan = soPhuc1.nhanHaiSoPhuc(soPhuc2);
        nhan.inSoPhuc();

        // Phép chia Nhân
        System.out.println("Chia hai so phuc!");
        Complex chia = soPhuc1.chiaHaiSoPhuc(soPhuc2);
        if (chia == null) {
            System.out.println("Khong the chia cho 0");
        } else {
            chia.inSoPhuc();
        }

    }
}
