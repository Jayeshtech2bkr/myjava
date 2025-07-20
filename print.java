import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class print {

    public static void printmyname(String name ){
        System.out.println(name);


        
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

       
        printmyname(name);

        
    }
    
}
