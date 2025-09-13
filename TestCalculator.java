class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(2, 3));
        System.out.printf("Addition of 2 doubles: %.1f\n", calc.add(3.4, 4.4)); // 1 decimal place
        System.out.println("Addition of 3 integers: " + calc.add(3, 4, 5));
    }
}
