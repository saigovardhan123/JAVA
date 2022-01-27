package project40;

public class BubbleSort {






	  public static void main(String[] args) {
	    int[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
	    int[] sortedArray = bubbleSort(intArr);
	    System.out.println("Sorted array is- ");
	    for(int num : sortedArray){
	      System.out.print(num + " ");
	    }
	  }
	    
	  private static int[] bubbleSort(int[] intArr){
	   
	    for(int i = intArr.length; i > 1; i--){
	      for(int j = 0; j < i - 1; j++){
	        
	        if(intArr[j] > intArr[j+1]){
	          swapElements(j, intArr);
	        }
	      }            
	    }
	    return intArr;
	  }
	    
	  private static void swapElements(int index, int[] intArr){
	    int temp = intArr[index];
	    intArr[index] = intArr[index+1];
	    intArr[index+1] = temp;        
	  }
	}