import java.lang.*;
import java.util.*;

//Write a program to print all Natural numbers from N to 1 where you have to take N as input from user
public class FromDown2Top {

    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i = 1;
            while(i <=N){
                System.out.print(N);
                System.out.print(" ");
                N--;
            }
        }
    }

}
