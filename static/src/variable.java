class Student{  
   int rollno;
   String name;  
   static String college ="BITS";//static variable  
   //constructor  
   Student(int rn, String n){  
   rollno = rn;  
   name = n;  
   }  
   //method to display the values  
   void display ()
   {
	   System.out.println(rollno+" "+name+" "+college);
	}  
}  
 
public class variable{  
 public static void main(String args[]){  
 Student v1 = new Student(987,"Mahesh");  
 Student v2 = new Student(210,"Raju");  
 
 v1.display();
 v2.display(); 
 
 }  
}  
