package Algo;

import java.util.ArrayList;
import java.util.Collections;

import Abstract_Classes.Sorting;

public class Quick extends Sorting{
	
	public Quick(ArrayList<Integer> x){

	    super(x);
	    
	    this.algorithm="Quick Sort";//explicitly change this for every separate algorithm
	  }
	
	@Override
	public void sort()
	{
		this.recurse(0, this.arr.size()-1);
		
	}
	
	private void recurse(int left,int right)
	{
		
		if (left>=right) return;//base case
		
		int partition_index=partition(left,right);//returns the partition index->basically where the pivot was inserted back
		
		recurse(left,partition_index-1); //enter to the left half of the current pivot
		
		recurse(partition_index+1,right); //enter the right half of the current pivot
		
	}
	
	private int partition(int left,int right)//function that partitions the list based on the pivot
	{
		int pivot=this.arr.get(right); //we choose our pivot as the last index
		
		int i=left; //keeps track of latest number smaller than pivot index
		
		
		for(int counter=left;counter<=right-1;counter++)//loop through array until the second last index
		{
			this.key_comparison++;
			
			if(this.arr.get(counter)<=pivot)
			{
				
				
				Collections.swap(this.arr, i, counter);
				i++;//update index i
			}
			
			else continue;//if the number is bigger than pivot, it wont move
			
		}
		Collections.swap(this.arr, i, right);//swap back the pivot point into where it belongs
		
		
		
		return i;//this number returned is the current pivot point index
		
	}

}
