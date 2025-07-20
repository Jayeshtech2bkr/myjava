import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] jay = new int[3][3];

        System.out.println("ENTER NUMBERS");

        for (int i = 0; i < jay.length; i++) {
            for (int j = 0; j < jay[i].length; j++) {
                jay[i][j]= sc.nextInt();

                
            }
            
        }
         for (int i = 0; i < jay.length; i++) {
            for (int j = 0; j < jay[i].length; j++) {

        
    
    System.out.print(jay[i][j] + " ");
            }
        }
        System.out.println();

    }
}