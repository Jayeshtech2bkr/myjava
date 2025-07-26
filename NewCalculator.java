import java.util.Scanner;
public class NewCalculator {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        double num1 ,num2, result=0;
        String operation;


        System.out.println("==========PRO CALCULATOR ==========");
        System.out.println("Supported Operation :: +,-,*,/,sqrt,^");
        System.out.println("tap exit to exit ");


        while (true){
            System.out.println("Enter Operation :: ");
            operation = sc.next();

            if (operation.equalsIgnoreCase("exit")){
                System.out.println("GOOD BYE AND COME AGAIN !!!");
                break;
            }

            if (operation.equals("sqrt")){
                System.out.println("Enter Number");
                num1 = sc.nextDouble();
                result = Math.sqrt(num1);
                System.out.println("Squareroot of number is" + result);

continue;



            }
            System.out.println("Enter First  Number");
            num1 = sc.nextDouble();

            System.out.println("Enter Second Number");
            num2 = sc.nextDouble();

            switch(operation){
                case "+":
                result = num1 + num2;
                break;

                 case "-":
                result = num1 - num2;
                break;

                 case "*":
                result = num1 * num2;
                break;

                 case "/":
                 if  (num2 == 0) {
                    System.out.println("ERROR :: NOT DIVISIBLE BY ZERO");
                    continue;
                 }
                    else{
                        result = num1 /num2 ;

                    }
                    break;

                    case "^":
                    result = Math.pow(num1 , num2);
                    break;


                    

            
               


            }
 System.out.println("Result: " +  result);
        }
         sc.close();
    }
    
}





