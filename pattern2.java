/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++){
		    k=i;
		    for(int j=i;j<n;j++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        
		        System.out.print(k);
		        k++;
		    }
		    System.out.println();
		}
	}
}