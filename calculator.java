import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in) ;

    System.out.println("Enter Principle");
    int principle = sc.nextInt();

    System.out.println(" Enter rate");
    int rate = sc.nextInt();

    System.out.println("Enter Intrest");
    int intrest = sc.nextInt();


    int simpleintrest = (principle*rate*intrest)/100;
    System.out.println("Simple intrest is " + simpleintrest );





}
    }

    

