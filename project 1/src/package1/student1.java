package package1;

public class student1 {
int age;
int rollno;
public void display1()
{
	System.out.println("welcome to all of you");
}
public void dislay2()
{
	System.out.println("automation is very easy");
}
public static void main(String[] args) {
	student1 obj=new student1();
	obj.display1();
	obj.dislay2();
	obj.age=31;
	System.out.println("age is "+obj.age);
	obj.rollno=12;
	System.out.println("rollno is " +obj.rollno);
}
}
