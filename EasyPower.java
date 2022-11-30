import java.lang.*;
import java.util.*;
//You are given two integers A and B. You have to find the value of AB.
// The value of AB will always be less than or equal to 109
public class EasyPower {
    public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int baseValue = scanner.nextInt();
            int powerValue = scanner.nextInt();
            if (baseValue == 1 || powerValue == 0) {
                System.out.println(1);
            } else {
                int result = 1;
                while (powerValue > 0) {
                    result = result * baseValue;
                    powerValue--;
                }
                System.out.println(result);
            }
        }
    }
}
