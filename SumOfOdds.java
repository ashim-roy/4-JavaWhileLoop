import java.lang.*;
import java.util.*;

//sum of all odd numbers in the range [1, A].

public class SumOfOdds {

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i = 1;
            int sum = 0;
            while(i <= N){
                if(i%2!=0){
                    sum = sum+i;
                    //System.out.print(" ");
                    //i++;
                }
                i++;
            }//i++;
            System.out.print(sum);
        }
    }
}
