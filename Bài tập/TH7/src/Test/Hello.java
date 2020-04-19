package Test;

class Hello implements Hello1, Hello2 {

    // Overriding default show method
    public void hello() {

        // method of PI1 interface
        Hello1.super.hello();

        // method of PI2 interface
        Hello2.super.hello();
    }

    public static void main(String args[]) {
        Hello test = new Hello();
        test.hello();
    }
}
