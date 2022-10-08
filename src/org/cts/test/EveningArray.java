package org.cts.test;

public class EveningArray {
	
	public static void main(String[] args) {
		
		//datatype variable[] = new datatype[size];
		//datatype variable [][] =new datatype[rowsize][columnsize];
		
		int a[][] = new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		//System.out.println(a[1][0]);
		//outer ---2
		for(int i=0;i<a.length;i++) {
			//inner
			for(int j=0;j<a.length;j++) {
				
				System.out.println(a[i][j]);
				//1st iteration --- a[0][0]
				//2nd iteration --- a[0][1]
				//3rd iteration ---- a[1][0]
				//4th iteration --- a[1][1]
			}
		}
		
	}

}
