package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MinimizeCost {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		String[] inputArr = input.split(" ");
		int [] arr = new int[inputArr.length];
		for(int i=0;i<inputArr.length;i++)
		{
			arr[i] =Integer.parseInt(inputArr[i]);
		}
		System.out.println(Arrays.toString(arr));
		
		int maxSum=0;
		int tempSum=0;
		int index=0;
		for (int i =0;i<arr.length;i++) 
		{
			int pos = i;
			int count = 1;
			tempSum=0;
			while(true)
			{
				for(int j = 1;j<=count;j++)
				{
					tempSum = tempSum + arr[pos];
					pos++;
				}
				count++;
				if(tempSum>=maxSum)
				{
					maxSum=tempSum;
					index=i;
				}
				if((pos+count)>arr.length)
				{
					break;
				}
			}
		}
		wr.write(String.valueOf(maxSum));
		wr.flush();
		

	}

}
