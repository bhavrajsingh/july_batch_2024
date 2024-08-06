package package1;

public class student {
int bhavraj; //varible
public void display() //method
{
	System.out.println("welcome");
}
public static void main(String[] args) {
	student ref=new student();
	ref.display();
	ref.display();
	ref.bhavraj=3;
	System.out.println("value of bhavraj"+ref.bhavraj);
}
}
