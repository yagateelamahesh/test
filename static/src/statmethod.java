class Student1{  
     int rollno;  
     String name;  
     static String college = "ITS";  
     static void change(){  
     college = "SASTRA";  
     }  
     //constructor 
     Student1(int rn, String n){  
     rollno = rn;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  
 
public class statmethod{  
    public static void main(String args[]){  
    Student1.change();  
    Student1 s1 = new Student1(174,"Ramun");  
    Student1 s2 = new Student1(523,"Aryan");  
    Student1 s3 = new Student1(398,"Kalyan");  
    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  