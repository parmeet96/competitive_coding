package com.checkpoint1.basicOfImp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class DigitProblem {

	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException 
	{

		
		String[] inputs= br.readLine().split(" ");
		String[] digits = inputs[0].split("");
		int k = Integer.valueOf(inputs[1]);
		int i=0;
		while(k!=0)
		{
			if(!digits[i].equals("9"))
			{
				digits[i] = "9";
				k--;
			}
			i++;
		}
		String joinedString = String.join("",digits);
		wr.write(joinedString);
		wr.flush();
	}

}
