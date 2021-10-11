package Algo;


import java.util.*;

import Abstract_Classes.Sorting;

public class Merge extends Sorting{

  public Merge(ArrayList <Integer> x){

    super(x);

    this.algorithm="Merge Sort";//explicitly change this for every separate algorithm

  
  }

  @Override
  public void sort()
  {
    this.recurse(0,this.arr.size()-1);
  }

  
  private void merge(int left,int right){ //merge function to combine to list together without auxilary storage
   
   int middle=((left+right)/2)+1;
    
   while(true) //this algorithm does not require any extra memory space as no new arrays are created
      {

        if(right-left==0) return;
        int temp=0;
        int inserter=left;//where we are gonna insert our elements
        
        if(middle>right || left==middle) break;
        
        

        if(this.arr.get(left)<this.arr.get(middle)) //if 1st element of the 1st half smaller
        {
          this.key_comparison++;
          
          temp=this.arr.get(left); //store in temp variable
          this.arr.remove(left); //remove as we are gonna shift it
          this.arr.add(inserter,temp);//add to the front of the list
          left++;//update left index
        }
        else if(this.arr.get(middle) < this.arr.get(left)) //if 1st element of the 2nd half smaller
        {
        	
          
          temp=this.arr.get(middle); 
          this.arr.remove(middle); 
          this.arr.add(inserter,temp); 
          left++;
          middle++;//update middle,this is in order to keep the left half of the array untouched
          this.key_comparison++;
          this.key_comparison++;

          
        }
        else //when the elements are the same
        {
        	
        	
        	
          
          temp=this.arr.get(middle); 
          this.arr.remove(middle); 
          this.arr.add(inserter,temp); 
          left++;
          left++;
          middle++;//update middle,this is in order to keep the left half of the array untouched
          
          this.key_comparison++;
          this.key_comparison++;

          
        }
      }
    }
  
  
  private void recurse(int left,int right){//recursive function for merge sort
    
    int middle=(left+right)/2; //middle index 

    if (right-left<=0) return; //base case,if left==right means we have reached maximum recursion depth


    else if(right-left>1){ 

      recurse(left,middle); //recurse left side ,the right is constantly updated (decreased) until right-left=1

      recurse(middle+1,right); //recurse right side,the left is constantly updated (increased) until right-left=1
    }
    
    this.merge(left,right); //merge function that combines the two halves together

  }

  

  
}