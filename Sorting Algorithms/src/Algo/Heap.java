package Algo;

import java.util.ArrayList;
import java.util.Collections;

import Abstract_Classes.Sorting;

public class Heap extends Sorting {
	
 public Heap(ArrayList<Integer> x){

	    super(x);
	    
	    this.algorithm="Heap Sort";//explicitly change this for every separate algorithm
 }
	
@Override

public void sort(){
	
	int size=this.arr.size();
	
	
	
	//Build heaps for current list, starting from lowest parent node from left to right
	
	for(int i=size/2-1;i>=0;i--) //formula for finding subtrees
	{
		
		heapify(i,size-1); //this function creates the the max heap, we pass in bounding indexes
		
    }
	
	
	for(int j=size-1;j>0;j--)
	{
		Collections.swap(this.arr,0,j); //swap the first and last node in the array
		
		heapify(0,j-1); //we pass in j-1 since we removed last node in the array
		
	}
	
	
}

private void heapify(int i,int size) {
	
	int largest_index=i;
	
	
	
	int left=2*i+1; //index for left subtree of the node
	
	int right=2*i+2; //index for left subtree of the node
	
	if(left>size && right>size)
	{
		return;
	}
	
	
	


	
	//we are trying to get the largest index of that specific subtree
	if(left<=size && this.arr.get(left)>this.arr.get(largest_index))
	{
		
		this.key_comparison++;
		
		largest_index=left;  //update largest_index to left
	}
	
	if(right<=size && this.arr.get(right)>this.arr.get(largest_index))
	{
		
		this.key_comparison++;
		
		largest_index=right; //update largest_index to left
	}
	
	if(largest_index!=i) //if largest index changed, we need to swap the positions
	{
		Collections.swap(this.arr,largest_index,i);
	
	
	    heapify(largest_index,size);
	}
	
	
	
	return;
	
	
  }


	

}
