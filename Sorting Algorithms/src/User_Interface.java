import java.util.Scanner;

import Algo.Bubble;
import Algo.Heap;
import Algo.Hybrid;
import Algo.Insertion;
import Algo.Merge;
import Algo.Quick;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

class User_Interface{

  private Scanner reader=new Scanner(System.in);
  private ArrayList <Integer> list;
  
  public User_Interface() {
  //16777216
	  ArrayList<Integer> arrayRandom = new ArrayList<Integer>();

      for (int i=0; i<100000; i++)
      {
          Random rand = new Random();
          Integer r = rand.nextInt();
          arrayRandom.add(r);

      }
      
      this.list=arrayRandom;
      
     
  }
    


  public void start(){
	
	Boolean end=false;
	
	
    System.out.println("\nWelcome to the Sorting Algorithm analysis interface!!!\n");

    System.out.println("Choose from our range of sorting algorithms: \n");

    System.out.println("1: Insertion Sort ");
    System.out.println("2: Merge Sort ");
    System.out.println("3: Bubble Sort ");
    System.out.println("4: Quick Sort ");
    System.out.println("5: Heap Sort ");
    System.out.println("6: Hybrid Sort ");
    System.out.println("7: Exit ");

    while(!end)
 {
    	
    System.out.println("Enter your option: ");
    
    int expression=reader.nextInt();
    

   
    switch(expression) {
    case 1:
    Insertion Insertion_list = new Insertion(this.list);
    Insertion_list.action();
    break;
    
    case 2:
    Merge Merge_list = new Merge(this.list);
    Merge_list.action();
    break;
    
    case 3:
    Bubble Bubble_list = new Bubble(this.list);
    Bubble_list.action();
    break;
        
    
    case 4:
    Quick Quick_list = new Quick(this.list);
    Quick_list.action();
    break;
        
    case 5:
    Heap Heap_list = new Heap(this.list);
    Heap_list.action();
    break;
            
    case 6:
    Hybrid Hybrid_list = new Hybrid(this.list);
    Hybrid_list.action();
    break;
    
    case 7:
    end=true;
    break;
   
    
    }
    
 }
  
}
}



  

