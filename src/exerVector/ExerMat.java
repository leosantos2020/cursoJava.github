package exerVector;

import java.util.Scanner;

public class ExerMat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [][] mat=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.print(mat[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("main diagonal: ");
		for(int i=0;i<n;i++) {
			System.out.print(mat[i][i]+" ");
			
		}
		System.out.println();
		int count=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j]<0) {
					count++;
				}
				
			}
		
		}
		System.out.println(" total de negativos: "+count);
	}
	

}
