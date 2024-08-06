package package1;

public class assignment2 {
public void sum(int a, int b) //((((10/2)-2)*2)-2)+2)
{
	int sum;
	sum= a+b;
	System.out.println("sum=final is"+sum);
	//return(sum);
	
}
public int sub(int s1, int s2) {
	int sub;
	sub=s1-s2;
	System.out.println("sub="+sub);
	return(sub);
}
public int mul(int m1, int m2)
{
	int mul;
	mul=m1*m2;
	System.out.println("mul="+mul);
	return(mul);
}
public int div(int d1, int d2)
{
	int div;
	div= d1/d2;   //((((10/2)-2)*2)-2)+2)
	System.out.println("div="+div);
	return(div);
}
public static void main(String[] args) {
	assignment2 obj=new assignment2();
	int divresult=obj.div(10, 2);
	int subresult1=obj.sub(divresult, 2);
	int mulresult=obj.mul(subresult1, 2);
	int subresult2=obj.sub(mulresult, 2);
	obj.sum(subresult2, 2);
}
}
