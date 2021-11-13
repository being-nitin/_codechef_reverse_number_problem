package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Given an Integer N, write a program to reverse it.
       Input
       The first line contains an integer T, total number of testcases.
       Then follow T lines, each line contains an integer N.

       Output
       For each test case, display the reverse of the given number N, in a new line.

       Constraints
       1 ≤ T ≤ 1000
       1 ≤ N ≤ 1000000
       Sample Input 1
       4
       12345
       31203
       2123
       2300
       Sample Output 1
       54321
       30213
       3212
       32
	 */
        Scanner sc = new Scanner(System.in);
        int t, rev = 0, rem, n;
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            System.out.println(reverseNumber(n));
        }
    }
    static int reverseNumber(int num){
     int rev=0;
        while(num>0){
         int rem = num%10;
         rev = rev*10 +rem;
         num = num/10;
        }
        return rev;
    }
}
