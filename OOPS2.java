class Student {
    String name;
    int age;

    public void PrintInfo(String name) {
        System.out.println(name);
    }

    public void PrintInfo(int age) {
        System.out.println(age);

    }

    public void PrintInfo(String name, int age) {
        System.out.println(name +  " " +"is " +" " + age + " YEARS OLD");

    }
}

public class OOPS2 {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.name = "JAYESH";
        s1.age = 18;
        s1.PrintInfo(s1.name, s1.age);

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "VISHAL";
        s2.PrintInfo(s2.name, s2.age);

        Student s3 = new Student();
        s3.age = 25;
        s3.name = "PIYUSH";
        s3.PrintInfo(s3.name, s3.age);

    }

}
