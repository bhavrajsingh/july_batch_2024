package package1;

public class students {
int age;
int rollno;
public void display1()
{
	System.out.println("welcome to all of u");
}
public void display2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	students obj=new students();
	obj.display1();
	obj.display2();
	obj.age=31;
	System.out.println("age="+obj.age);
	obj.rollno=12;
	System.out.println("roll no.="+obj.rollno);
}
}
