import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF BOX");
        int n = sc.nextInt();
        int[] jay = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("ENTER NUMBER HERE");
            jay[i] = sc.nextInt();

        }
        System.out.println("ENTER NUMBER YOU WANNA SEARCH");
        int key = sc.nextInt();
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (jay[i] == key) {
                index = i;
                break;

            }
        }
        System.out.println("NUMBER IS ");
        System.out.println(index);
    }

}
