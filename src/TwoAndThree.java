import java.util.Enumeration;

public class TwoAndThree {
    public  static boolean areNoTwoAndThree(int number){
     while(number > 0) {
         int digit = number % 10;
         if(digit == 2  || digit == 3){
             return false;
         }
         number /= 10;
     }
     return true;
    }

    public static void main(String[] args) {
        int number = 8888;
        if(areNoTwoAndThree(number)) {
            System.out.println("No number two and three");
        } else {
            System.out.println("Have this number");
        }
    }
}
