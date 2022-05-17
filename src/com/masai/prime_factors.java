package com.masai;

public class prime_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*The prime factors of a number are all of the integers below that number that are divisible
		into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6, and 12.*/
		prime(12);
	}
	public static void prime(int n) {
		if(n>100 || n<1) {
			System.out.println("Invalid number");
			return ;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
