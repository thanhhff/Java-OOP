package Test;

import java.util.Objects;

class MyValue {
    private int number;

    public MyValue(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyValue)) return false;
        MyValue myValue = (MyValue) o;
        return number == myValue.number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class EqualsMethod2 {
    public static void main(String[] args){
        MyValue v1 = new MyValue(100);
        MyValue v2 = new MyValue(100);
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(100));
    }
}
