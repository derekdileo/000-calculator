

public class Main {

    public static void main(String[] args) {

        // Add
        System.out.println(Calculator.add(5, 2) == 7);
        System.out.println(Calculator.add(6, 4) == 10);
        System.out.println(Calculator.add(0, -1) != 1);

        // Subtract
        System.out.println(Calculator.subtract(5, 2) == 3);
        System.out.println(Calculator.subtract(-5, -11) == 6);
        System.out.println(Calculator.subtract(0, 0) == 0);

        // Multiply
        System.out.println(Calculator.multiply(5, 10) == 50);
        System.out.println(Calculator.multiply(20, 10) == 200);
        System.out.println(Calculator.multiply(-20, -10) == 200);
        System.out.println(Calculator.multiply(-20, 10) == -200);

        // Divide
        System.out.println(Calculator.divide(10, 5) == 2);
        System.out.println(Calculator.divide(10, 0) == -1); // Cannot divide by 0!
        System.out.println(Calculator.divide(-10, 2) == -5);

    }
}
