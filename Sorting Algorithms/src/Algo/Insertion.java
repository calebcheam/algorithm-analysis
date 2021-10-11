package Algo;
import java.util.*;

import Abstract_Classes.Sorting;

public class Insertion extends Sorting{

  public Insertion(ArrayList<Integer> x){

    super(x);
    
    this.algorithm="Insertion Sort";//explicitly change this for every separate algorithm
  }


  @Override
  public void sort()
  {

    for(int i=0;i<this.arr.size();i++) //first for loop, displays the incremental approach
    {
      for(int j=i;j>0;j--) //second for loop
      {
        if(this.arr.get(j) < this.arr.get(j-1))
        { 
          
          this.key_comparison++;
          Collections.swap(this.arr,j,j-1); //using collections to swap elements in the arraylist
          
        }
        else
        { 
          this.key_comparison++;
          
          break; //if the next number is bigger or equal than the orderedlist on the left, there is no need to move/insert the number anywhere
        }



      }
    }


  }




}