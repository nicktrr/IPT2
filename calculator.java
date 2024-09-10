public class Main{
    public static void main (String[] args){
        Add adder = new Add();
        Subtract subtractor = new Subtract();
        Product multipier = new Product();
        Division divider = new Division();
        Modulus modulusOperator = new Modulus();

        int sum = adder.add(5,6);
        int difference = subtractor.subtract(5,8);
        int product = multipier.product(3,5);
        int quotient = divider.division(10,2);
        int modulus = modulusOperator.modulus(10,5);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);
    }
}