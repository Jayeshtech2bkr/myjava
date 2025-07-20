import java.util.Scanner;

public class Radius {
    public static double radius(double r ){
        return 2*Math.PI*r;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double circumference = radius( r);
        System.out.println(circumference);


        }
        
}

