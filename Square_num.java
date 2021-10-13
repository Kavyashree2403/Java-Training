package Functioncall;

import java.util.Scanner;

public class Square_num {
static int Square_Diff(int n)
{
int l, k, m;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number : ");
n = scan.nextInt();
    l = (n * (n + 1) * (2 * n + 1)) / 6;
    k = (n * (n + 1)) / 2;
    k = k * k;
    m = Math.abs(l - k);    
    return m;
}
public static void main(String s[])
{
   int n=100;
   System.out.println(Square_Diff(n));    	  
}
}