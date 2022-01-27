package project40;

public class MergeSort {






	  public static void main(String[] args) {
	    int[] intArr = {47, 85, 620, 3456, -7, 10, 4500, 106, -345, 1000, 67, 80, 5500, 34, 78, 782, 4, 0, 99, 190};
	    MergeSort ms = new MergeSort();
	    ms.mergeSortRecursive(intArr, 0, intArr.length-1);
	    System.out.println("Sorted array after merge sort- ");
	    for(int num : intArr){
	      System.out.print(num + " ");
	    }
	  }
	    
	  private void mergeSortRecursive(int[] intArr, int lower, int upper){
	    //base case
	    if (lower == upper){
	      return;
	    }else{
	      // get mid point for division of array
	      int middle = (lower + upper)/2;
	      
	      mergeSortRecursive(intArr, lower, middle);        
	      mergeSortRecursive(intArr, middle+1, upper);
	      
	      merge(intArr, lower, middle, upper);
	    }
	  }
	    
	  private void merge(int[] intArr, int lower, int middle, int upper){
	  
	      int subArrayOneLength = middle - lower + 1;
	      int subArrayTwoLength = upper - middle;
	      int[] temp1 = new int[subArrayOneLength];
	      int[] temp2 = new int[subArrayTwoLength];
	      for(int i = 0; i < subArrayOneLength; i++){
	        temp1[i] = intArr[lower + i];
	      }
	      for(int j = 0; j < subArrayTwoLength; j++){
	        temp2[j] = intArr[middle + 1 + j];
	      }           
	      int i =0;        
	      int j = 0;
	     
	      while((i < subArrayOneLength) && (j < subArrayTwoLength)){
	        if(temp1[i] < temp2[j]){
	          intArr[lower] = temp1[i++];
	        }else{
	          intArr[lower] = temp2[j++];
	        }
	        lower++;
	      }
	     
	      while(i < subArrayOneLength){
	        intArr[lower++] = temp1[i++];
	      }
	      while(j < subArrayTwoLength){
	        intArr[lower++] = temp2[j++];
	      }
	  }
	}