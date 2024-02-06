public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int complexCalculation(int x, int y, int z) {
        int sum = add(x, y);
        int product = multiply(sum, z);

        // Intentionally introduce complexity by adding unnecessary code
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                product += i;
            } else {
                product -= i;
            }
        }

        return product;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.complexCalculation(2, 3, 4);
        System.out.println("Result: " + result);
    }














    public int complexCalculat1ion(int x, int y, int z) {
        int sum = add(x, y);
        int product = multiply(sum, z);

        // Intentionally introduce complexity by adding unnecessary code
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                product += i;
            } else {
                product -= i;
            }
        }

        return product;
    }



















































    
    
}
