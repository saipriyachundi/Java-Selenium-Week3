public class MethodsExample {
    static int sum(int a, int b) {
        return a + b;
    }

    int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        MethodsExample obj = new MethodsExample();
        System.out.println("Sum: " + sum(4, 6));
        System.out.println("Factorial: " + obj.factorial(5));
    }
}
