package Algo;

import java.util.ArrayList;

import Abstract_Classes.Sorting;

import java.util.*;

public class Bubble extends Sorting{
	
	public Bubble(ArrayList<Integer> x){

	    super(x);
	    
	    this.algorithm="Bubble Sort";//explicitly change this for every separate algorithm
	  }
	
	@Override
	public void sort(){
		
		int swap_counter=-1;
		int left=0;
		int right=1;
		
		
		while(swap_counter!=0)
		{
			swap_counter=0;
			left=0;
			right=1; //reset everything
			
			while(left!=this.arr.size()-1)//if left has not reached last index of list
			{
				this.key_comparison++;
				if(this.arr.get(left)>this.arr.get(right))
				{
				   Collections.swap(this.arr,left,right);
				   swap_counter++;
				}
				
				left++;
				right++;
			
			}
			
		}
		
		}
	}
