package Ankur;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //number of element in set A
        int m = in.nextInt(); //number of element in set B
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++)
        {
            b[b_i] = in.nextInt();
        }
        Arrays.sort(b);
        boolean bol1=false;
        if(a[a.length-1]>b[0]){
        	System.out.println(0);
        	bol1=true;
        }
        int count=0;
        for(int j=a[a.length-1];j<=b[0];j++){
        	if(bol1==true)
        		break;
        	int bol=0;
        	boolean flag=true;
        	
        	for(int i=0;i<a.length;i++){
        		
        		for(int k=0; k<b.length;k++){
        		if(b[k]%j !=0  )
        		{
        			flag=false;
        			break;
        		}
        		}
        		if(j%a[i] != 0 )
        		{
        			flag=false;
        			break;
        		}
        	}
        	if(flag==true){
        		//System.out.println(j);
        		count++;
        	}
    }
        if(bol1==false)
        	System.out.println(count);
}
}
