package com.ptbc.simpleproject;

public class BasicAlgorithm {
	public static void main(String[] args) {
		buildPattern(5);
		buildPattern(-1);
		buildPattern(101);
	}
	
	private static void buildPattern(int n){
		if(n>0 && n <= 100){
			for(int i = 1; i <= n; i++){
				for(int j=n; j >=i; j--){
					System.out.print(" ");
				}
				for(int l=1; l <= i; l++){
					System.out.print("#");
				}

				System.out.println("");
			}
		}
	}
}
