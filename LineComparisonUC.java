
import java.util.Scanner;

public class LineComparisonUC
{

	public double getLenghtOfLine(int x1,int x2,int y1,int y2)
	{
		double lengthLine=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

		return lengthLine;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Entert The Value of X1 :");
		int x1=sc.nextInt();

		System.out.println("Enter The Value of X2 :");
		int x2=sc.nextInt();

		System.out.println("Enter the Value of Y1 :");
		int y1=sc.nextInt();

		System.out.println("Enter the Value of Y2 :");
		int y2=sc.nextInt();

		LineComparisonUC lc = new LineComparisonUC();

		System.out.println("Length Of Line : "+lc.getLenghtOfLine(x1,x2,y1,y2));
	}
}
