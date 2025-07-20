import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE HERE");
        int age = sc.nextInt();


        if (age >= 18){
        System.out.println("can vote");
    
}
      
        else {
        System.out.println("Cannot vote");
}


    }

}
