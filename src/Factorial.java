public class Factorial {
    public static int factNum(int number) {
        if(number == 0 || number == 1) {
            return 1;
        }
        int count = 1;
        for(int i = 2; i <= number; i ++){
            count *= i;
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.println(factNum(5));
    }
}
