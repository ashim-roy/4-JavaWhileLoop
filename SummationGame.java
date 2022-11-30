import java.lang.*;
import java.util.*;


public class SummationGame {
    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int sum =0;
            int i = 0;
            while ( i <= N ){
                sum = sum+i;
                i++;
            }
            System.out.print(sum);
        }
    }

}
