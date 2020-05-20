package testpro; 

class resp 
{ 
    public static int i = 0; 
    
    resp() 
    { 
        i++; 
          
    } 
    
    public static int tre()  
    { 
        
        return i; 
    } 
  
    
    public int m1() 
    { 
        System.out.println("Inside the method m1 by object of m1 class"); 
          
        
        this.m2(); 
          
        
        return 1; 
    } 
  
   
    public void m2()  
    { 
  
        System.out.println("In method m2 came from method m1"); 
    } 
} 
  
class Method
{ 
    public static void main(String[] args)  
    { 
        
        resp obj = new resp(); 
          
        
        int i = obj.m1(); 
        System.out.println("Control returned after method m1 :" + i); 
          
         
        int objects = resp.tre(); 
          
        System.out.print("No of instances created till now : "); 
        System.out.println(objects); 
          
    } 
} 