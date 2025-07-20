import java.util.Scanner;

public class isEVEN{

    public static boolean A (int n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
         
        if (A(n)) {  
            System.out.println("even");
        }
        else {
            System.out.println("odd");
            
        }

        
    }
}


