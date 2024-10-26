public class SameNumbers {
    public static boolean areNumbersSame(int number) {
        String numberString = String.valueOf(number);
        char[] digits = numberString.toCharArray();

        for(int i = 1; i < digits.length; i++) {
            if(digits[i] != digits[0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 1111;
        System.out.println(areNumbersSame(number));
    }
}
