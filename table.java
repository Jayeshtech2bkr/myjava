import java.util.Scanner;

public class table {
    public static void tab(int n){
        System.out.println(n);
        for (int i = 1; i < 11; i++) {
            System.out.println(n*i);

        } 
        }
        public static void main(String[] args){
            Scanner sc = new Scanner (System.in);

             int n = sc.nextInt();

             tab(n);

        }
    }

