package mypack;

public class Person {
    public String name;
    int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name + "hff";
        this.age = age;
        this.height = height;

    }

    public void eat(String foodName) {
        System.out.println(name + " is eating " + foodName);
    }

    public int getAge() {
        return age;
    }
}