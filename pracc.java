class Student {
    int age;
    String name;
    int marks;

    public void printInfo(int age) {
        System.out.println(age);

        System.out.println(name);

        System.out.println(marks);

    }
}

public class pracc {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jayesh";
        s1.age = 15;
        s1.marks = 50;

        s1.printInfo(s1.age);

    }

}