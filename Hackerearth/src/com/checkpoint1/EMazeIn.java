package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EMazeIn {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException 
	{
		String input = br.readLine();
		char[] array = input.toCharArray();
		int lr = 0;
		int ud = 0;
		for (char c : array) 
		{
				switch(c)
				{
				case 'L':
						lr--;
						break;
				case 'R':
						lr++;
						break;
				case 'D':
						ud--;
						break;
				case 'U':
					 ud++;
					 break;
				}
			
		}
		wr.write(String.valueOf(lr)+" "+String.valueOf(ud));
		wr.flush();

	}

}
