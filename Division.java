public class Division {
    public static void main(String[] args) {
        int num1 = 20; // Dividend
        int num2 = 5;  // Divisor

        // Check if divisor is not zero to avoid division by zero error
        if(num2 != 0) {
            int quotient = num1 / num2; // Integer division
            System.out.println("Quotient of " + num1 + " divided by " + num2 + " is: " + quotient);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}