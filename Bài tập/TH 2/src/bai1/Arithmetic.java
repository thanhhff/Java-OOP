package bai1;
import java.util.Collections;

public class Arithmetic {
    public static void main(String[] args){
        int data[] = {78, 65, 78, 21, 93, 45, 33, 55, 22, 81};
        int sum = 0;
        double arg = 0d;

        int min = data[0];
        int max = data[0];
        for (int i = 0; i < data.length; i++)
        {
            sum += data[i];

            if (data[i] < min){
                min = data[i];
            }
            if (data[i] > max){
                max = data[i];
            }
        }

        arg = 1.0 * sum / data.length;

        System.out.println("Sum: " + sum);
        System.out.println("Args: " + arg);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
