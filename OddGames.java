import java.lang.*;
import java.util.*;
//Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive

public class OddGames {


    public class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int i =1;
            while(i <= N){
                if(i%2 !=0){
                    System.out.print(i);
                    System.out.print(" ");
                }
                i++;
            }
        }
    }

}
