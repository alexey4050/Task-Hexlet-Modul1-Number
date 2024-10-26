public class PerfectNumber {
    public static boolean findPerfectNumber(int number) {
        int result = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                result += i;
            }
        }
        return result == number;
    }

    public static void main(String[] args) {
        int number = 6;
        if(findPerfectNumber(number)) {
            System.out.println("совершенное число - " + number);
        } else {
            System.out.println("несовершенное число - " + number);
        }
    }
}


