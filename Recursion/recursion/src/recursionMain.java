public class recursionMain {
    public static void main(String[] args) {
        // walk(5);
        // walkRecusion(500);
        System.out.println("Factorial of 10: " + factorial(10));
        System.out.println("2 power 8: " + power(2, 8));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1)
            return 1;
        return base * power(base, exponent - 1);
    }

    private static int factorial(int num) {
        if (num < 1)
            return 1;
        return num * factorial(num - 1);

    }

    // private static void walkRecusion(int steps) {
    // if (steps < 1)
    // return;
    // System.out.println("You take a steps!");
    // walk(steps - 1);
    // }

    // private static void walk(int steps) {
    // for (int i = 0; i < steps; i++) {
    // System.out.println("You take a steps!");
    // }
    // }
}
