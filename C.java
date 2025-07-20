
import java.util.Scanner;
public class C {
    public static int multi(int a , int b , int c ,int d){
        int multiple = a*b+c+d;
        return multiple;

    }

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER NUNMBER");
        int a = sc.nextInt();
        System.out.println("ENTER NUNMBER");
        int b = sc.nextInt();
        System.out.println("ENTER NUNMBER");
         int c = sc.nextInt();
         System.out.println("ENTER NUNMBER");
         int d = sc.nextInt();

        int multiple =multi(a, b ,c ,d);
        System.out.println(multiple);



    }
    
}
