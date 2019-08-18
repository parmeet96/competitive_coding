package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class TestClassw {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int n = Integer.valueOf(br.readLine());
		ArrayList<String> dislike = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			dislike.add(br.readLine().toUpperCase());
		}
		int count =  Integer.valueOf(br.readLine());;
		ArrayList<String> accronym = new ArrayList<>();

		String[] arr = br.readLine().toUpperCase().split(" ");
		
		String result="";
		
		for(String word : arr)
		{
			if(!dislike.contains(word))
			{
				String[] temp = word.split("");
				result+=temp[0]+".";
			}
		}
		
		result = result.substring(0,result.length()-1);
		wr.write(result);
		wr.flush();
	}

}
