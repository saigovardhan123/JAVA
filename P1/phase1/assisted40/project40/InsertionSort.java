package project40;

public class InsertionSort {






	  public static void main(String[] args) {
	    int[] intArr = {47, 85, 62, 34, 7, 10, 92, 106, 2, 54};
	    int[] sortedArray = insertionSort(intArr);
	    System.out.println("Sorted array is- ");
	    for(int num : sortedArray){
	      System.out.print(num + " ");
	    }
	  }
	    
	  private static int[] insertionSort(int[] intArr){
	    int temp;
	    int j;
	    for(int i = 1; i < intArr.length; i++){
	      temp = intArr[i];
	      j = i;
	      while(j > 0 && intArr[j - 1] > temp){
	        
	        intArr[j] = intArr[j - 1];
	        --j;
	      }
	   
	      intArr[j] = temp;
	    }
	    return intArr;
	  }
	}