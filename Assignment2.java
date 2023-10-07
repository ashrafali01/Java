//Q.1->

package practice;

class shape {
	int width;
	int height;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}

public class questions {

	public static void main(String args[]) {
		shape s1= new shape();
		s1.setHeight(150);
		System.out.println(s1.getHeight());
		s1.setWidth(100);
		System.out.println(s1.getWidth());
	}
}

//Q.2->


package practice;

class Sample
{
	int num3;
	Sample()
	{
		System.out.println("inside default constructor");
	}
	
	Sample(int num)
	{
		this.num=num;
		System.out.println("inside parameterized constructor");
	}
	Sample (int num1,int num2){
		this.num=num1;
		this.num3=num2;
		System.out.println("Inside Two parameterized constructor");
	}
	private int num;
	
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
		
	}
	public int getNum3()
	{
		System.out.println(num);
		return num3;
		
	}
}
public class questions 
{
	public static void main(String args[])
	{
		Sample s1=new Sample();  // will invoke "default constructor" provided by compiler
		s1.setNum(200);
		System.out.println(s1.getNum());

		Sample s2=new Sample(100);  // will invoke "parameterized constructor"
		System.out.println(s2.getNum());
		
		Sample s3 =new Sample(34,56);
		System.out.println(s3.getNum3());
		
	}
}

//Q.3->


package practice;

class Sample
{
	private int num;
	private static int cnt=10;
	public Sample(int num)
	{
		this.num=num;
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public static int getCnt()
	{
		return cnt;
	}
}
		
public class questions
{
	public static void main(String args[])
	{
		Sample s1=new Sample(100);
		System.out.println(s1.getNum());

		Sample s2=new Sample(200);
		System.out.println(s2.getNum());

		System.out.println(Sample.getCnt());
				
	}
}

//Q.4->


package practice;
class DemoOb
{
	private int num;   // instance member or member variable

	// setter and getter

	public void setNum(int num)  // member function
	{
		this.num=num;
	}
	public int getNum()   // member function
	{
		return num;
	}
}
public class questions
{
	public static void main(String args[])
	{
		DemoOb ob1=new DemoOb();   //  new instance or new object creation
		ob1.setNum(150); 
		System.out.println(ob1.getNum());
		DemoOb ob2=ob1; // ob2 refers to the same object where "ob1" refers to
		System.out.println(ob2.getNum());
		ob1=new DemoOb();  // here we created new ob1 so by default value = 0
		System.out.println(ob1.getNum());
	}	
	}

//Q.5->


package practice;
class A{
	private static int num1=10;

	public static int getNum1() {
		return num1;
	}
}
class B{
	private static int num2=20;

	public static int getNum2() {
		return num2;
	}

}
class C{
	private int num3; // non static

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	}

public class questions{
	public static void main(String args[]) {
	
		System.out.println(A.getNum1()); // calling the static member
		System.out.println(B.getNum2()); // calling static member
		C c1= new C(); // creating object for Class C
		c1.setNum3(30); // passing the calue to class C
		System.out.println(c1.getNum3()); // getting the value
	}
}

//Q.6->


package practice;
class A{
	private static int num1=10;

	public static int getNum1() {
		System.out.println("Inside First Static Member");
		return num1;
	}
}
class B{
	private static int num2=20;

	public static int getNum2() {
		System.out.println("Inside Second Static Member");
		return num2;
	}

}
class C{
	private static int num3=30;

	public static int getNum3() {
		System.out.println("Inside Third Static Member");
		return num3;
	}
}

public class questions{
	public static void main(String args[]) {
	
		System.out.println(A.getNum1()); // calling the static member
		System.out.println(B.getNum2()); // calling static member
		System.out.println(C.getNum3()); // getting the value
	}
}