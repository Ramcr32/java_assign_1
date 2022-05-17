package com.masai;

public class CricketScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketScore(2,3,4,1,2);
	}
	public static void cricketScore(int first, int second, int third, int four, int six) {
		int sum=first*1+second*2+third*3+four*4+six*6;
		System.out.println("Total score:"+sum);
	}

}
