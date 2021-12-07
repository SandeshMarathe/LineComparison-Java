
import java.util.Scanner;

public class LineComparisonUC
{

	public double getLengthOfLine1(int x1,int x2,int y1,int y2)
	{
		double lengthLine1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

		return lengthLine1;
	}

	public double getLengthOfLine2(int a1,int a2,int b1,int b2)
	{
		double lengthLine2=Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));

		return lengthLine2;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("First Line Input.?");

		System.out.println("Enter The Value of X1 :");
		int x1=sc.nextInt();

		System.out.println("Enter The Value of X2 :");
		int x2=sc.nextInt();

		System.out.println("Enter the Value of Y1 :");
		int y1=sc.nextInt();

		System.out.println("Enter the Value of Y2 :");
		int y2=sc.nextInt();

		System.out.println("Second Line Input.?");

		System.out.println("Enter the Value of A1 :");
		int a1=sc.nextInt();

		System.out.println("Enter the Value of A2 :");
		int a2=sc.nextInt();

		System.out.println("Enter the Value of B1 :");
		int b1=sc.nextInt();

		System.out.println("Enter the Value of B2 :");
		int b2=sc.nextInt();

		LineComparisonUC lc = new LineComparisonUC();

		System.out.println("Length Of Line 1 : "+lc.getLengthOfLine1(x1,x2,y1,y2));

		System.out.println("Lenght of Line 2 : "+lc.getLengthOfLine2(a1,a2,b1,b2));

		if (lc.getLengthOfLine1(x1,x2,y1,y2)==lc.getLengthOfLine2(a1,a2,b1,b2))
		{
			System.out.println("Both Lines Are Equal..");
		}
		else
		{
			System.out.println("Both Lines Are Not Equal..");
		}
	}
}
