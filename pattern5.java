/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int a=2*n-1;
	int b=0;
	int c=a-1;
	int arr[][]=new int[a][a];
	while(n!=0){
	    for(int i=b;i<=c;i++){
	        for(int j=b;j<=c;j++){
	            if(i==b || j==b || i==c ||j==c){
	            arr[i][j]=n;
	            }
	        }
	    }
	    b++;
	    c--;
	    n--;
	  
	   
	}
	  for(int i=0;i<a;i++){
	        for(int j=0;j<a;j++){
	              System.out.print(arr[i][j]+" ");
	        }
	         System.out.println();
	    }
	}
}