package package1;

public class Arithmetic1 {
public int sum(int a,int b) // ((((10+2)+2)-2)*2)/2)
{
	int sum ;
	sum= a+b;
	System.out.println("total sum is"+sum);
	return sum;
}
public int mul(int m1,int m2)
{
	int m3;
	m3= m1*m2;
	System.out.println("mul is"+m3);
	return m3;
	
}
public int sub(int s1,int s2)
{
	int s3;
	s3=s1-s2;
	System.out.println("subtraction is"+s3);
	return s3;
}
public void div(int d1, int d2)
{
	int d3;
	d3=d1/d2;
	System.out.println("division is(final)"+d3);
}
public static void main(String[] args) {
	Arithmetic1 obj=new Arithmetic1();
	int sumresult1=obj.sum(10,2);
	int sumresult2=obj.sum(sumresult1, 2);
	int subresult=obj.sub(sumresult2, 2);
	int mulresult=obj.mul(subresult, 2);
	obj.div(mulresult, 2);
	
}
}
