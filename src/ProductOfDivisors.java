public class ProductOfDivisors {
    public static int productDivisibleBy3(int number) {

        int product = 1;
        for (int i = 1; i <= number; i++){
            if(number % i == 0 && number % 3 == 0) {
                product *= i;
            }
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(productDivisibleBy3(12));
    }
}
