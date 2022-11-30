import java.lang.*;
import java.util.*;

//You are given a positive integer A. You have to print the sum of all even numbers in the range [1, A].
public class SumofEvens {
    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i = 0;
            int sum = 0;
            while (i <= N) {
                if (i % 2 == 0) {
                    sum = sum + i;
                    //i = i+1;
                }
                i++;
            }
            System.out.print(sum);
        }
    }
}
