import java.util.Scanner;

public class fun {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER NumbeR");
       int  num=sc.nextInt();

       square(num);



    }
    static void square (int num) {


       System.out.println("SQUARE OF NUMBER IS " +num*num);
        
    }
}