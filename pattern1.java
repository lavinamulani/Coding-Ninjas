/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0,c=0,d=0;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		        c++;
		    }
		    while(k!=2*i-1){
		        if(c<=n-1){
		            System.out.print(i+k);
		            c++;
		        }
		        else{
		            d++;
		            System.out.print(i+k-(2*d));
		        }
		        k++;
		    }
		    c=d=k=0;
		    System.out.println();
		}
	}
}