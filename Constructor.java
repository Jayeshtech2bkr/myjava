class Student {
    String name;
    int age;
    String branch;

    Student(String a, int b, String c) {
        name = a;
       age = b;
        branch = c;

    }

    void display() {

        System.out.println(name  +" "+ "is studing " + branch + " " + "at " + age);

    }
}

public class Constructor {
    public static void main(String[] args) {
        Student j1 = new Student("Jayesh", 18, "Computer Engineering");
        j1.display();
    }
}
