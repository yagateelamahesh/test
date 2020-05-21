package search;

import java.util.Scanner;  

class Linear   
{  
  public static void main(String args[])  
  {  
    int i, n, srch, array[];  
   
    Scanner it = new Scanner(System.in);  
    System.out.println("Enter number of elements");  
    n = it.nextInt();   
    array = new int[n];  
   
    System.out.println("Enter those " + n + " elements");  
   
    for (i = 0; i< n; i++)  
      array[i] = it.nextInt();  
   
    System.out.println("Enter value to find");  
    srch = it.nextInt();  
   
    for (i = 0; i < n; i++)  
    {  
      if (array[i] == srch)      
      {  
         System.out.println(srch + " is present at location " + (i + 1) + ".");  
          break;  
      }  
   }  
   if (i == n)  
      System.out.println(srch + " isn't present in array.");  
  }  
}  