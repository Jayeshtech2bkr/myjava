public class varargs2 {

    // Method using varargs to find maximum
    static void findMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers given.");
            return;
        }

        int max = numbers[0];  // assume first is max

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum = " + max);
    }

    public static void main(String[] args) {
        findMax(10, 50, 20, 80);  // Output: 80
        findMax(5, 2);            // Output: 5
        findMax();                // Output: No numbers given.
    }
}
