public class Main2 {
    static int a = 100;

    public static void main(String[] args) {
        int b = 50;
        System.out.println(a);
        // System.out.println(c); // what happens here?
    }

    static void fun() {
        int c = 25;
        System.out.println(a);  // works
        // System.out.println(b); // what happens here?
    }
}

