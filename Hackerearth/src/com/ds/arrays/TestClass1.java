package com.ds.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class TestClass1 {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		ArrayList<Integer> arr = new ArrayList<>();
		int queries = Integer.valueOf(br.readLine());
		for(int i=0;i<queries;i++)
		{
			String[] quer = br.readLine().split(" ");
			switch (Integer.valueOf(quer[0])) 
			{
				case 1:arr.add(Integer.valueOf(quer[1]));
				break;
				case 2:if(!arr.remove(Integer.valueOf(quer[1])))
				{
					wr.write("-1");
					wr.flush();
				}
				break;
				case 3:
					if(arr.size()==0)
					{
						wr.write("-1");
						wr.flush();
					}
					else
					{
						wr.write(String.valueOf(Collections.max(arr)));
						wr.flush();
					}
					break;
				case 4:
					if(arr.size()==0)
					{
						wr.write("-1");
						wr.flush();
					}
					else
					{
						wr.write(String.valueOf(Collections.min(arr)));
						wr.flush();
					}
					break;
			default:
				break;
			}
		}
	}

}
