package Abstract_Classes;
import java.util.*;



public abstract class Sorting{
  
  public List<Integer> arr;
  
   
  
  public int key_comparison;
  
  public String algorithm;

  public Sorting(ArrayList<Integer> x)
  {
	this.arr = (ArrayList<Integer>)x.clone();
    
	this.key_comparison=0;

    //System.out.println("List Given: "+x);
    System.out.println("Size of List: "+x.size());
    
  }


  public void action()
  {
    System.out.println("");
    System.out.println("---Performing "+this.algorithm+"---");

    this.sort();

    System.out.println("");
    
    //System.out.println("Sorted List: "+(this.arr));

    System.out.println("Number Of Key Comparisons: "+(this.key_comparison));
  }

  public void sort(){}
  
  

  
  







  

  








  







}