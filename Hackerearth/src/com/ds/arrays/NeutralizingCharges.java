package com.ds.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.print.attribute.standard.MediaSize.Other;

public class NeutralizingCharges {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static String removeDuplicate(String str1)
	{
		String[] str = str1.split("");
		String temp="";
		String result="";
		String firstOccurance="";
		for(int i=0;i<str.length;i++)
		{
			temp=str[i];
			firstOccurance = temp;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					temp = temp+str[i];
				}else
				{
				//	temp= str[i];
					i=j-1;
					break;
				}
				
			}
			if(temp.length()%2!=0)
			{
				result=result+firstOccurance;
			}
		
		}
		return result;
	}
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int n = Integer.parseInt(br.readLine());
		//char[] arr = new char[n];
		String outpt="";
		String result="";
		String str=br.readLine();
		String preResult=NeutralizingCharges.removeDuplicate(str);
		while(true)
		{ 
			result= NeutralizingCharges.removeDuplicate(preResult);
			if(preResult.equals(result))
			{
				break;
			}
			else
			{
				preResult=result;
			}
		}
		
		wr.write(String.valueOf(result.length()));
		wr.write("\n");
		wr.write(result);
		wr.flush();

	}

}
