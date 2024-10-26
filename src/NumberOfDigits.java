import java.util.Scanner;

public class NumberOfDigits {
    public static int findNumberOfDigits(int number) {
        if(number < 10) {
            return 1;
        }
        int count = 0;
        String numberDigits = String.valueOf(number);
        for (int i = 1; i <= numberDigits.length(); i ++){
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Цифры которую нужно ввести: ");
        System.out.println(findNumberOfDigits(number));
    }
}