 import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creates a Scanner to read input
        
        int N = scanner.nextInt();  // Reads the first number (N = size of input)
        int max = scanner.nextInt(); // Reads the second number and assumes it's the max
        
        for (int i = 1; i < N; i++) {  // Loop runs (N-1) times (since first number is already read)
            int current = scanner.nextInt();  // Reads the next number
            if (current > max) {  // Checks if current number > max
                max = current;    // Updates max if true
            }
        }
        
        System.out.println(max);  // Prints the largest number
        scanner.close();  // Closes the Scanner (good practice)
    }
} 
    

