
import java.util.Scanner;

public class LineComparisonUC
{

	int x1,x2,y1,y2;

	Scanner sc = new Scanner(System.in);

	public void getLine()
	{
		System.out.println("Enter The Value of X1 :");
                int x1=sc.nextInt();

                System.out.println("Enter The Value of Y1 :");
                int y1=sc.nextInt();

                System.out.println("Enter the Value of X2 :");
                int x2=sc.nextInt();

                System.out.println("Enter the Value of Y2 :");
                int y2=sc.nextInt();

	}

	public double getLengthOfLine()
	{
		System.out.println(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}

	public static String compareTo(double l1,double l2)
	{
		if(l1==l2)
		{
			return "Length Are Same :";
		}
		else
		{
			if(l1>l2)
			{
				return "Line 1 is Bigger Than Line 2";
			}
			else
			{
				return "Line 1 is Smaller Than Line 2";
			}
		}
	}

	public static void main(String args[]) 
	{

		LineComparisonUC line1 = new LineComparisonUC();
		LineComparisonUC line2 = new LineComparisonUC();

		line1.getLine();
		line2.getLine();

		double lengthLine1 = line1.getLengthOfLine();
		double lengthLine2 = line2.getLengthOfLine();

		System.out.println("Length Of Line 1 :"+line1.getLengthOfLine());

		System.out.println("Length Of Line 2 :"+line2.getLengthOfLine());

		System.out.println(compareTo(lengthLine1,lengthLine2));
	}
}
