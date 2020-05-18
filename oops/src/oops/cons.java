package oops;

class Box 
{ 
    double width, height, depth; 
  
     
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
  
    
    Box() 
    { 
        width = height = depth = 0; 
    } 
  
    
    Box(double len) 
    { 
        width = height = depth = len; 
    } 
  
    
    double volume() 
    { 
        return width * height * depth; 
    } 
} 
  

public class cons
{ 
    public static void main(String args[]) 
    { 
        
       
        Box b1 = new Box(10, 20, 30); 
        Box b2= new Box(); 
        Box b3 = new Box(7); 
  
        double vol; 
  
        
        vol = b1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        
        vol = b2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
  
        
        vol = b3.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 