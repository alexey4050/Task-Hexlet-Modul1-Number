public class SumOddNumbers {
    public static int getAmmount(int number) {
        if (number < 10) {
            return number;
        }
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            if(digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 23456733;
        System.out.println(getAmmount(number));
    }
}
