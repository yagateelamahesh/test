class constructoverload{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    constructoverload(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    constructoverload(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    constructoverload c1 = new constructoverload(111,"Karan");  
    constructoverload c2 = new constructoverload(222,"Aryan",25);  
    c1.display();  
    c2.display();  
   }  
}  
