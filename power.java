/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

                  int a,b,sum=1;
                  Scanner sc=new Scanner(System.in);
                  a=sc.nextInt();
                  b=sc.nextInt();
                 for(int i=1;i<=b;i++)
                 {
                 	sum=sum*a;
                 }
                  System.out.println(sum);
	}
}
