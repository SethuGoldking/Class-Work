import java.util.Scanner
class Calculator
{
	public static void main (String [] args)
	calculator c =  new calculator();
	
	Scanner sc= new Scanner (System.in)
	double a = sc.nextdouble();
	System.out.println("Enter first number :");
	double b = sc.nextdouble();
	System.out.println("Enter Secound number :");
	char c = sc.next().charAt(0);
	System.out.println("Enter your Operator :");
	System.out.println(c.cal(a,b,c));


	{
		public double cal(double a,double b,);
		double d = 0;
		switch ()
		{
			case +:
			d=a+b;
			break();
			
			case -:
			d=a-b;
			break();
			
			case *:
			d=a*b;
			break();
			
			case \:
			d=a\b;
			break();
			
			default ()
			System.out.println("Sorry");
		}
		
	}
}