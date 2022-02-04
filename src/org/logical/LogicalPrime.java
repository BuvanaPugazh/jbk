package org.logical;

public class LogicalPrime {
	public static void main(String[] args) {
		int i=7;
		int temp=0;
		for(i=2;i<i;i++) {
			if(i%i==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
