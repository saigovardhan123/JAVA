package project40;

public class SelectionSort {


	  public static void main(String[] args) {
	    int[] numArray = {47, 85, 620, 3456, 7, 10, 4500, 106, 345, 1000};
	    int[] sortedArray = selectionSort(numArray);
	    System.out.println("Sorted array is- ");
	    for(int num : sortedArray){
	      System.out.print(num + " ");
	    }
	  }
	  private static int[] selectionSort(int[] numArray){
	    int lowest;
	    for(int i = 0; i < numArray.length - 1; i++){
	      lowest = i;
	      for(int j = i+1; j < numArray.length; j++){
	  
	        if(numArray[j] < numArray[lowest]){
	          lowest = j;
	        }
	      }
	      swapElements(i, lowest, numArray);
	    }
	    return numArray;
	  }
	    
	  private static void swapElements(int index, int lowest, int[] numArray){
	    int temp = numArray[index];
	    numArray[index] = numArray[lowest];
	    numArray[lowest] = temp;
	    
	  }
	}