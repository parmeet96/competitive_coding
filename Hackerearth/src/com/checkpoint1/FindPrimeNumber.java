package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FindPrimeNumber {


	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		boolean flag;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=2;i<=n;i++)
		{
			flag = false;
			for(int k=i;k>=2;k--)
			{
				if(k!=i)
				{
					if(i%k==0)
					{
						flag = true;
						break;
					}		
				}
			}
			if(!flag)
				wr.write(String.valueOf(i)+" ");
		}
		wr.flush();
	}

}
