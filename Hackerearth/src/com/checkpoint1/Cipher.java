package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Cipher {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException 
	{
		String message = br.readLine();
		int n = Integer.parseInt(br.readLine());
		int p = n;
		char[] messageChar =message.toCharArray();
		for(int i=0;i<messageChar.length;i++)
		{
			n=p;
			int operation = (int)messageChar[i];
			if((int)messageChar[i]>=65 &&(int)messageChar[i]<=90)
			{
				n = n%26;
				operation = operation+n;
				if(operation >90)
				{
					operation = operation - 90 + 64;
				}
				messageChar[i] = (char)operation;
			}
			else if((int)messageChar[i]>=97 &&(int)messageChar[i]<=122)
			{
				n = n%26;
				operation = operation+n;
				if(operation >122)
				{
					operation = operation - 122 + 96;
				}
				messageChar[i] = (char)operation;
			}
			else if((int)messageChar[i]>=48 &&(int)messageChar[i]<=57)
			{
				n = n%10;
				operation = operation+n;
				if(operation >57)
				{
					operation = operation - 57 +47;
				}
				messageChar[i]=(char)(operation);
			}
		}
		wr.write(String.valueOf(messageChar));
		wr.flush();
	}

}
