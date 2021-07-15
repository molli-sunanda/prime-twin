import java.util.*;
class Twinprime
{
public static void main(String args[])
{
int x,n,count=0,c=0,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any two numbers");
x=sc.nextInt();
n=sc.nextInt();
for(int i=1;i<=x;i++)
{
if(x%i==0)
count++;
}
for(int i=1;i<=n;i++)
{
if(n%i==0)
c++;
}
d=Math.abs(x-n);
if(d==2&&count==2&&c==2)
System.out.println("Twin Prime numbers");
else
{
System.out.println("Not Twin Prime numbers");
}
}
}

