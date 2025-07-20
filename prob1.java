import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER");


        int N = sc.nextInt();
        int[] bala = new int[N];

        for (int i = 0; i < N; i++) {
            bala[i] = (i + 1) * (i + 1);

        }

        for (int bachha : bala) {
            System.out.println("here are squares" +bachha);

        }

    }
}
