public class Student {

    public String name;
    public int age;
    public float height;

    public static String universityName = "Kteam Education";
    public static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public static void getInfoUniversity() {
        System.out.println(universityName);
    }
}