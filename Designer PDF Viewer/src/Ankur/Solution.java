package Ankur;
import java.util.*;
public class Solution {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[] h=new int[26];
		for(int i=0;i<26;i++){
			h[i]=scan.nextInt();
		}
		String word =scan.next();
		int len=word.length();
		int max=0;
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int i=0;
		for(char ch='a';ch<='z';ch++){
			map.put(ch,h[i]);
			i++;
		}
		for(int k=0;k<len;k++){
			int v=map.get(word.charAt(k));
			if(v>max)
				max=v;
		}
		System.out.println(max * len);

	}

}
