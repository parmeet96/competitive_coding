package com.checkpoint1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class StandardInputOutput {
	
		private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		private static final BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
			
		public static void main(String[] args) throws NumberFormatException, IOException
		{
			  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		        int n = Integer.parseInt(br.readLine());
		        ArrayList<String> arr = new ArrayList<>();
		        ArrayList<String> dist = new ArrayList<>();
		        int[][] matrix = new int[n][n];
		        for(int i=0;i<n;i++)
		        {
		        	arr.add(br.readLine());
		        }
		        for(int i = 0;i<n;i++)
		        {
		        	String[] split = br.readLine().split(" ");
		        	for (int j = 0; j < split.length; j++) {
						matrix[i][j] = Integer.parseInt(split[j]);
					}
		        	
		        }
		        int num =Integer.parseInt(br.readLine());
		        for(int i=0;i<num;i++)
		        {
		        	dist.add(br.readLine());
		        }
		        
		        int initial_row = 0;
		        int initial_col = 0;
		        int sum=0;
		        for(int i=0;i<dist.size();i++)
		        {
		        	initial_col=arr.indexOf(dist.get(i));
		        	sum+= matrix[initial_row][initial_col];
		        	initial_row = initial_col;
		        }
		       wr.write(String.valueOf(sum));
		      

		        
		        wr.flush();
		    }
		}


