
    import java.lang.*;
import java.util.*;

public class hi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println("Since all sides are same, hence it's an equilateral triangle");
        } else if (A == B || B == C || C == A) {
            System.out.println("Since two sides are equal, hence it's an isosceles triangle");
        } else {
            System.out.println("Since all sides are different, hence it's a scalene triangle");
        }

        sc.close();
    }
}
    

