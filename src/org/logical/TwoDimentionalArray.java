package org.logical;

public class TwoDimentionalArray {
	public static void main(String[] args) {
	int [][]num=new int[2][2];{
	num[0][0]=10;
	num[0][1]=20;
	num[1][0]=30;
	num[1][1]=40;
//iterate
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num.length;j++) {
			System.out.println(num[i][j]);
			}
		}
	//iterate enhanced for loop
	for(int[] is:num) {
		for(int i:is) {
			System.out.println(i);
		
			}
		}
	}
	}
}

	
	


