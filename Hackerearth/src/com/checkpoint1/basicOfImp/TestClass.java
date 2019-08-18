package com.checkpoint1.basicOfImp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));



	public static void main(String[] args) throws IOException 
	{
		String[] input1 = br.readLine().split(" ");
		int m = Integer.valueOf(input1[0]);
		int n = Integer.valueOf(input1[1]);
		
		ArrayList<Integer> arr = new ArrayList<>();
		String[] input2 = br.readLine().split(" ");
		Stream<String> stream = Arrays.stream(input2);
		stream.forEach(String::toUpperCase);
		for(int i=0;i<m;i++)
		{
			arr.add(Integer.valueOf(input2[i]));
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			Collections.sort(arr,Collections.reverseOrder());
			sum +=arr.get(0);
			arr.set(0, arr.get(0)-1);
		}
		wr.write(String.valueOf(sum));
		wr.flush();
	}

}
