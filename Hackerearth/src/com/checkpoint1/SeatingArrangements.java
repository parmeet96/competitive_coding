package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SeatingArrangements {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int rem;
		String seatType="";
		wr.flush();
		for(int i=0;i<n;i++)
		{
			int seatNumber = Integer.parseInt(br.readLine());
			
			if(seatNumber % 12 ==0)
			{
				rem = seatNumber/12;
			}
			else
			{
				rem = (seatNumber/12) + 1;
			}
			int row = 12* rem;
			int compartment = row - seatNumber;
			if(compartment <= 5)
			{
				switch(compartment)
				{
				case 0:
					seatNumber = seatNumber-11;
					seatType ="WS";
					break;
				case 1:
					seatNumber = seatNumber-9;
					seatType ="MS";
					break;
				case 2:
					seatNumber = seatNumber -7 ;
					seatType ="AS";
					break;
				case 3:
					seatNumber = seatNumber -5;
					seatType ="AS";
					break;
				case 4:
					seatNumber = seatNumber- 3;
					seatType ="MS";
					break;
				case 5:
					seatNumber = seatNumber -1;
					seatType ="WS";
					break;
				}
			}
			else
			{
				switch(compartment)
				{
				case 11:
					seatNumber = seatNumber+11;
					seatType ="WS";
					break;
				case 10:
					seatNumber = seatNumber+9;
					seatType ="MS";
					break;
				case 9:
					seatNumber = seatNumber +7 ;
					seatType ="AS";
					break;
				case 8:
					seatNumber = seatNumber +5;
					seatType ="AS";
					break;
				case 7:
					seatNumber = seatNumber+3;
					seatType ="MS";
					break;
				case 6:
					seatNumber = seatNumber+1;
					seatType ="WS";
					break;
				}
			}
			
			wr.write(String.valueOf(seatNumber)+" "+seatType);
			wr.newLine();
		}
		wr.flush();
	}

}
