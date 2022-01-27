package project40;

public class QuickSort {






	  public static void main(String[] args) {
	    int[] numberArr = {47, 65, 52, 10, 43, 67, 80, 34, 55, 48};
	    QuickSort qs = new QuickSort();
	    qs.quickSortRecursive(numberArr, 0, numberArr.length-1);
	    System.out.println("Sorted array after quick sort- ");
	    for(int num : numberArr){
	      System.out.print(num + " ");
	    }
	  }
	    
	  private void quickSortRecursive(int[] numberArr, int lower, int upper){
	    if(upper - lower <= 0){
	      return;
	    }else{
	      int partition = partition(numberArr, lower, upper);
	    
	      quickSortRecursive(numberArr, lower, partition-1);
	     
	      quickSortRecursive(numberArr, partition+1, upper);
	    }
	  }
	    
	  private int partition(int[] numberArr, int lower, int upper){
	    int pivot = numberArr[upper];
	    int left = lower - 1;
	    int right = upper;
	    while(true){
	
	      while(numberArr[++left] < pivot);
	     
	      while(right > 0 && numberArr[--right] > pivot);
	      if(left >= right){
	        break;
	      }else{
	        swap(numberArr, left, right);
	      }
	    }
	    swap(numberArr, left, upper);
	    return left;
	  }
	    
	  private void swap(int[] numberArr, int i, int j){
	    int temp = numberArr[i];
	    numberArr[i] = numberArr[j];
	    numberArr[j] = temp;
	  }
	}