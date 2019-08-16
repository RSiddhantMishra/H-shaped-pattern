//'main' method must be in a class 'Rextester'.
//Compiler version 1.8.0_111

import java.util.*;
import java.lang.*;

class Pattern
{  
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=3;
        for(int i=0;i<(n);i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=i;j<(n*2)-p;j++)
            {
                System.out.print(" ");
            }
            p++;
            for(int k=0;k<=i;k++)
            {
                if(k<n-1)
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int j=i+1;j<(n*2)-i;j++)
            {
                System.out.print(" ");
            }
            p++;
            for(int k=i;k>0;k--)
            {
                if(k<=n-1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}