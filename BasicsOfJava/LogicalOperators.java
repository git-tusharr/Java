public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);

        // Logical AND
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));

        // Logical OR
        System.out.println("(a < 5 || b < 10): " + (a < 5 || b < 10));

        // Logical NOT
        System.out.println("!(a == b): " + !(a == b));
    }
}
