package package1;

public class assignment1 {
public int sum(int a,int b) //(((((10+2)*2)-2)*2)/2)
{
	int sum;
	sum=a+b;
	System.out.println("sum="+sum);
	return(sum);
}
public int sub(int s1, int s2)
{
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
public void div(int d1,int d2)
{
	int div;
	div=d1/d2;
	System.out.println("div=final answer"+div);
}
public static void main(String[] args) {
	assignment1 obj=new assignment1();
	int sumresult=obj.sum(10, 2);
	int mulresult1=obj.mul(sumresult, 2);
	int subresult=obj.sub(mulresult1, 2);
	int mulresult2=obj.mul(subresult, 2);
	obj.div(mulresult2, 2);
}
}
