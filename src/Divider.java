
public class Divider {
public static int productDivider(int number) {
    int[] dividers = new int[number + 1];
    int result = 1;
    int dividerCount = 0;
    for(int i = 1; i <= number; i ++) {
        if (number % 3 == 0) {
            dividers[dividerCount] = i;
            dividerCount++;
        }
    }
        for(int j = 0; j < dividerCount; j++) {
            result *= dividers[j];
        }
        return result;
}
    public static void main(String[] args) {
        System.out.println(productDivider(3));
    }
}
