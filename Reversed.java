/*public class Reversed {
    public static void main(String[] args) {
        
        String jay = "Hello";
        String reversed = "";

        for(int i=jay.length()-1; i>=0;i--){

            reversed += jay.charAt(i);
            
        }
        System.out.println(reversed);
        }
}*/










import java.util.Scanner;
public class Reversed {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER STRING HERE");
        String str = sc.nextLine();
        String reversed = "";

        for(int i = str.length()-1 ; i>=0; i--){

            reversed+= str.charAt(i);

        }
        System.out.println(reversed);

    }
}
