import java.lang.*;
import java.util.*;

//Write a program to print the multiplication table of the number entered by the user, N.
public class MultiplicationTable {
    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);

            int table = sc.nextInt();

            int i=1;

            while(i<=10){
                System.out.println(table+" * "+i+" = "+table*i);
                i+=1;
            }
        }
    }
}
