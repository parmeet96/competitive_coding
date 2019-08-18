package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestClass {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));


	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int t = Integer.parseInt(br.readLine());
		for(int i =0;i<t;i++)
		{
			String[] split = br.readLine().split(" ");
			int n = Integer.parseInt(split[0]);
			int a = Integer.parseInt(split[1]);
			int b = Integer.parseInt(split[2]);
			int c = Integer.parseInt(split[3]);
			int d = Integer.parseInt(split[4]);
			int move =Integer.parseInt(split[5]);
			
			while(true)
			{
				if(move == 0)
				{
					a = a+1;
					if(a == n)
					{
						System.out.println("White wins");
						wr.flush();
						break;
					}
					move = 1;
				}else if(move ==1)
				{
					if(d!=b)
					{
						if(c>a)
						{
							c--;
							d--;
						}
					}
					else
					{
						c--;
					}
					if(a==c)
					{
						wr.write("Draw\n");
						wr.flush();
						break;
					}
					move = 0;
				}
			}
			
		}
		wr.flush();
	}

}
