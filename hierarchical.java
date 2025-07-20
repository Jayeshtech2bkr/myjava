class Shape {
    public void area() {
        System.out.println("Displays area of shape");

    }

}

class Triangle extends Shape {

    int l;
    int b;

    public void area(int l, int b) {
        System.out.println(0.5 * l * b);

    }

}
class Circle extends Shape { 
    int r;
   public void area(int r) { 
       System.out.println((3.14)*r*r); 
   }  
}

public class hierarchical {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        t1.l = 2;
        t1.b = 5;
        

        Circle t2 = new Circle();
        t2.r=5;

         t2.area(t2.r);
         t1.area();
        t1.area(t1.l, t1.b);


    }
}
