public class vb {
    private String name;
    private String email;
    private int age;

    public String getname() {
        return name;

    }

    public void setname(String name) {
        if (name != null) {
            this.name = name;

        } else {
            System.out.println("invalid name");
        }

    }

    public String getemail() {
        return email;

    }

    public void setemail(String email) {
        this.email = email;

    }

    public int getage() {
        return age;

    }

    public void setage(int age) {
        if (age > 0 && age < 150) { 
            this.age = age;

        } else {
            System.out.println("invalid age");
        }
    }

    public static void main(String args[]) {
        vb stud1 = new vb();

        stud1.setname("jay");
        stud1.setemail("jay123@gmail.com");
        stud1.setage(18);

        System.out.println(stud1.getname());
        System.out.println(stud1.getemail());
        System.out.println(stud1.getage());

    }
}