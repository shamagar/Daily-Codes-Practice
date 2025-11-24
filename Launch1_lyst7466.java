class Demo
{	
	int age;
	double avg;
	
	void disp()
	{
		int num1=1;
		int num2=2;
		
//		age=15;
//		avg=44.5;
		System.out.println(age);
		System.out.println(avg);
		
		System.out.println("****************************");
		
		System.out.println(num1);
		System.out.println(num2);
	}
	void show()
	{
		System.out.println(age);
		System.out.println(avg);
		
		//num1=2;Ce
	}
}
public class Launch1 
{

	public static void main(String[] args) 
	{
		
      Demo d=new Demo();
      
      d.disp();
	}

}
