import java.lang.*;
import java.util.*;

//Write a program to print all Natural numbers from 1 to N where you have to take N as input from user

public class FromTtoptoDown {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;
        while(N>=i){
            System.out.print(i);
            System.out.print(" ");
            i = i+1;
        }
    }

}


