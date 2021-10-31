class Employee{
  string name;
  int year;
  string address;
  void insert(string n,int y,string a){
   name=n;
   year=y;
   address=a;
}
void display()
{System.out.println(name+"  "+year+"  "+address);}
}
public class TestEmployee{
public static void main(String[]args){
  Employee e1=new Employee();
  Employee e2=new Employee();
  Employee e3=new Employee();
  e1.insert("Robert",1994,64C-"WallsStreet");
  e2.insert("Sam",2000,68D-"WallsStreet");
  e3.insert("John",1999,26B-"WallsStreet");
  e1.display();
  e2.display();
  e3.display();
}
}
