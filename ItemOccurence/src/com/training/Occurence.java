package com.training;

public class Occurence {
	
	public static void main(String[]args) {
		int[] arr=new int[] {1,5,2,1,2,6,7,1};
		int[] occ=new int[arr.length];
		int visited=-1;
		
		for(int i = 0; i<arr.length; i++) {
			int count=1;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					occ[j]=visited;
				}}
				if(occ[i]!=visited) {
					occ[i]=count;
					}
			}
			for(int i=0; i<occ.length ; i++)
				if(occ[i]!=visited) {
					
					System.out.println("   ELEMENTS:  "     +    arr[i]     +    "  OCCURENCE:  "   +occ[i]);
				}
		}
		
	}


