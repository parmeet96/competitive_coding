package com.timecomplexity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.regex.*;
public class VowelRecognition  {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));


	public static void main(String[] args) throws NumberFormatException, IOException {

		int t=Integer.parseInt(br.readLine());
		ArrayList<String> arr = new ArrayList<String>();
		Pattern pattern = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
		for(int i=0;i<t;i++)		
		{
			int sum=0;
			String str=br.readLine();
			for(int j=0;j<str.length();j++)
			{
				for(int k=j+1;k<=str.length();k++)
				{
					String temp =str.substring(j,k);
					Matcher matcher = pattern.matcher(temp);
					while(matcher.find())
					{
						sum=sum+1;
					}					
				}
			}
			System.out.println(sum);
		
		}

			
			
		}
		
	}


