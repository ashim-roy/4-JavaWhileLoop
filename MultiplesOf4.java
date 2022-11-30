import java.lang.*;
import java.util.*;
//Given an integer input N, print all multiples of 4 less than or equal to N.

public class MultiplesOf4 {

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i = 1;
            while(i <=N){
                if(i%4==0){
                    System.out.print(i);
                    System.out.print(" ");
                }
                // System.out.print(N);
                //System.out.print(" ");
                i++;
            }
        }
    }
}
