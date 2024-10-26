public class FrendlyNumber {
    public static boolean areFrendlyNumbers(int numberOne, int numberTwo) {
        int sumOfDivisors1 = sumOfDivisors(numberOne);
        int sumOfDivisors2 = sumOfDivisors(numberTwo);
        return sumOfDivisors1 == numberTwo && sumOfDivisors2 == numberOne;
    }
    public static int sumOfDivisors(int number) {
        int sum = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int numberOne = 220;
        int numberTwo = 220;
        if(areFrendlyNumbers(numberOne, numberTwo)) {
            System.out.println("дружественные числв");
        } else {
            System.out.println("недружестенные числа");
        }
    }
}
