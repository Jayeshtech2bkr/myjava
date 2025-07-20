import java.util.Scanner;

public class D {

    
    public static int factorial(int a ){
        int factorialhi = 1;
      for(int i = a; i >= 1;i-- ){
      factorialhi = factorialhi*i;
      }
        System.out.println(factorialhi);
      return factorialhi;

      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        factorial( a );
    }
}

