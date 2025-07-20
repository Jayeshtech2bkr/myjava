import java.util.Scanner;

public class S {
    public static int Average(int a ,int b ,int c) {
        int Avg =( a+b+c)/3;
        return Avg;

        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = Average(a, b, c);
        System.out.println(result);
        
    }

    
}
