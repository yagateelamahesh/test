package stat;

class Parent { 
	  
    void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class childclass1 extends Parent { 
  
    void Print() 
    { 
        System.out.println("childclass1"); 
    } 
} 
  
class childclass2 extends Parent { 
  
    void Print() 
    { 
        System.out.println("childclass2"); 
    } 
} 
  
class polymorphism { 
    public static void main(String[] args) 
    { 
  
        Parent a; 
  
        a = new childclass1(); 
        a.Print(); 
  
        a = new childclass2(); 
        a.Print(); 
         
        a= new Parent();
        a.Print();
    } 
   
} 