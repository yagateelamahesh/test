package stat;

abstract class Shape  
{ 
    String color; 
      
    // abstract methods 
    abstract double area(); 
    public abstract String toString(); 
      
   
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
   
        
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    
    double area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    
    public String toString() { 
        return "Circle color is " + super.color +  
                       "and area is : " + area(); 
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    
    double area() { 
        return length*width; 
    } 
  
    
    public String toString() { 
        return "Rectangle color is " + super.color +  
                           " and area is : " + area(); 
    } 
  
} 
public class Abstractt
{ 
    public static void main(String[] args) 
    { 
        Shape c1 = new Circle("Red", 2.8); 
        Shape c2 = new Rectangle("Yellow", 2, 6); 
          
        System.out.println(c1.toString()); 
        System.out.println(c2.toString()); 
    } 
} 
