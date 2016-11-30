package Ankur;
import java.util.*;
public class Solution {

	public static void main(String[] args)
	{
	  Scanner scan=new Scanner(System.in);	
	  int i=scan.nextInt();
	  int j=scan.nextInt();
	  int k=scan.nextInt();
	  int count=0;
	  System.out.println("aa");
	  for(int x=i;x<=j;x++){
		  int num=0;
		  int y=x;
		  while(y>0){
			  int temp=y%10;
			  num=num*10 +temp;
			  y=y/10;
			  
		  }
		  if (Math.abs(x-num) % k ==0 )
			  count++;
	  }
	  System.out.println(count);

	}

}
