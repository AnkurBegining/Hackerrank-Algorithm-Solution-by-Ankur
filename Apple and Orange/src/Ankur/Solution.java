package Ankur;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); //initial point of home
        int t = in.nextInt(); //final point of home
        int a = in.nextInt(); // point of apple 
        int b = in.nextInt(); // point of orange
        int m = in.nextInt(); //number of Apple
        int n = in.nextInt(); //number of orange
        int count=0;
        int[] apple = new int[m]; 
        for(int apple_i=0; apple_i < m; apple_i++)
        {
            apple[apple_i] = in.nextInt();
            if(a+apple[apple_i]>=s && a+apple[apple_i]<=t)
            	count++;
        }
        int count1=0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            if(orange[orange_i]+b<=t && orange[orange_i]+b>=s)
            	count1++;
        }
        System.out.println(count);
        System.out.println(count1);
    }
}
