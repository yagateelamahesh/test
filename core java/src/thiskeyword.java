class thiskeyword{  
int rollno;  
String name;  
float fee;  
thiskeyword(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
  
class TestThis2{  
public static void main(String args[]){  
thiskeyword s1=new thiskeyword(111,"ankit",5000f);  
thiskeyword s2=new thiskeyword(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  
