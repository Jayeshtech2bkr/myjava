
    import java.lang.*;
    import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        
        int sum = N1 + N2;
        int remainder = sum % N3;

        System.out.println(remainder);
        sc.close();
    }
}
    

