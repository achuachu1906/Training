package com.training;
import java.util.*;

public class PermuteString {
	public static void main(String[] args) {
		String str="CAT";
		int n= str.length();
		PermuteString permute= new PermuteString();
		PermuteString.Permutation(str,0,n-1);
		}
	
	
	   private static void Permutation(String str,int a,int b) {
	   if(a==b) {
		   System.out.println(str);
	   }else {
		   for(int i=a;i<=b;i++) {
			   str=swap(str,a,i);
			   Permutation(str,a+1,b);
			   str=swap(str,a,i);
		   }
	   }
	   }


private static String swap(String str,int i,int j) {
	char temp;
	char[] charArray=str.toCharArray();
	temp=charArray[i];
	charArray[i]=charArray[j];
	charArray[j]=temp;
	return String.valueOf(charArray);
}
}