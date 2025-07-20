import java.util.Scanner;

public class hii {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[]=new int[n];


        for(int i = 0; i < array.length ; i++){
            array[i]= sc.nextInt();

        }
        for(int i = 0; i < array.length ; i++){
        System.out.println(i+array[i]);
        }

    }
}
