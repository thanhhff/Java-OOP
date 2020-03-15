package baitap;

public class SoThuanNghich {
    public static void main(String[] args){

        int start = 100000;
        int end = 999999;

        System.out.println("So thuan nghich: ");
        for (int i = start; i <= end; i++ ){
            if (checkNumber(i) == 0)
                continue;
            else
                System.out.println(i);

        }
    }

    public static int checkNumber(int x){

        String s = String.valueOf(x);

        for (int i = 0; i <= (s.length() - 1) / 2; i++){
            if (s.charAt(i) == s.charAt(s.length() - i - 1))
                continue;
            else
                return 0;
            }
        return x;
    }
}
