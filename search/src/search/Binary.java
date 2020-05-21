package search;

class Binary{  
	 public static void binarySearch(int arr[], int fir, int last, int key){  
	   int mid = (fir + last)/2;  
	   while( fir <= last ){  
	      if ( arr[mid] < key ){  
	        fir = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (fir + last)/2;  
	   }  
	   if ( fir > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }  
	 public static void main(String args[]){  
	        int arr[] = {100,200,300,400,500};  
	        int key = 500;  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	 }  
	}  
