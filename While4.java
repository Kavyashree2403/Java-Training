package Loop;
public class While4
{
static void reduceFraction(int x, int y)
{
 int d;
 d = __gcd(x, y);
 x = x / d;
 y = y / d;
 System.out.printf("%d/%d is the reduced fraction\n",x,y);
 //System.out.println("x = " + x + ", y = " + y);
}
static int __gcd(int a, int b)
{
 if (b == 0)
     return a;
 return __gcd(b, a % b); 
}
public static void main(String[] args)
{
 int x = 3;
 int y = 12;
 reduceFraction(x, y);
}   
}