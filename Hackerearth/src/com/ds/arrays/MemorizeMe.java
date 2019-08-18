package com.ds.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MemorizeMe 
{
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {

		Integer n = Integer.valueOf(br.readLine());
		String[] arrInput = br.readLine().split(" ");
		List<Integer> listArr = Arrays.stream(arrInput).map(Integer::valueOf).collect(Collectors.toList());
		int numbers = Integer.valueOf(br.readLine());
		HashMap<Integer,Long> hash = new HashMap<>();
		for(int i =0;i<numbers;i++)
		{
			   int testNumber = Integer.valueOf(br.readLine());

			   if(hash.containsKey(testNumber))
			   {
				   wr.write(String.valueOf(hash.get(testNumber))+"\n");
			   }
			   else
			   {
				   long count = listArr.parallelStream().filter(number->number==testNumber).count();
					if(count>0)
					{
						wr.write(String.valueOf(count)+"\n");
						hash.put(testNumber, count);
					}
					else
					{
						wr.write("NOT PRESENT"+"\n");
					}   
			   }
				
			
		}
		wr.flush();
	}

}
