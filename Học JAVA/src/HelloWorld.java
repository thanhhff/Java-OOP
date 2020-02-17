public class HelloWorld {
    static String course;

    static {
        System.out.println("HowKteam");
        course = "Java core";
    }

    public static void main(String[] args) {
        System.out.println("Free education");
        System.out.println("course:" + HelloWorld.course);
    }
}