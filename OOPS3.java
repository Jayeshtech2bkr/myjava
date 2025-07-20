class Student {
    int age;
    String name;

    public void Printinfo(String name) {
        System.out.println(name);
    }

    public void Printinfo(int age) {
        System.out.println(age);
    }

    public void Printinfo(String name   , int age){
        System.out.println(name);
         System.out.println(age);

    }

}

public class OOPS3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 18;
        s1.name = "JAYESH";
        s1.Printinfo(s1.name , s1.age);

      
    }

}
