import java.util.Scanner;

public class DegreeNumber {
    public static int countDegreeNumber(int x, int y) {
        int result = 1;
        int i = 0;
        while(i < y) {
            result *= x;
            i++;
        }
        int j = 0;
        do {
            result *= x;
            j++;
        } while (j < y);
        return  result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x и y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Результат: " + countDegreeNumber(x, y));
    }
}
