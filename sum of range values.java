import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=0;
          int sum=0;
        for(i=a;i<=b;i++)
      
        {
            sum=sum+i;
        }
        System.out.println("The sum of Range value from "+a+" to " +b+" is "+(float)sum);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
