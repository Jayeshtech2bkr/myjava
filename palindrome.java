import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A STRING");
        String jay = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(jay);
        sb.reverse();
        String rev = sb.toString();

        if (jay.equals(rev )) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


    }
}
