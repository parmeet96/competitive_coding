package com.ds.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static boolean isPrime(int number) {

	    // Even numbers
	    if (number % 2 == 0) {
	        return number == 2;
	    }

	    // Odd numbers
	    int limit = (int)(0.1 + Math.sqrt(number));
	    for (int i = 3; i <= limit; i += 2) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int testcase = Integer.valueOf(br.readLine());
		
		for(int i=0;i<testcase;i++)
		{
			int sum=0;
			String[] arr =(br.readLine().split(" "));
			for(int j = Integer.valueOf(arr[0]);j<=Integer.valueOf(arr[1]);j++)
			{
				if(j!=1 && isPrime(j) )
				{
					sum+=j;
				}
				
			}
			wr.write(String.valueOf(sum));
			wr.flush();
		}
		
			
	}
}
