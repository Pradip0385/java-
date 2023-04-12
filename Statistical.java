package statistics;
import java.util.Arrays;
public class Statistical{
	
	public static double mean(double []num)
	{
			double sum=0.0;
			for (double n:num)
			{
				sum+=n;
			}
			return sum/num.length;
	}
	public static double median(double []num)
	{
			Arrays.sort(num);
			int mid=num.length/2;
			if (num.length%2==0)
			{
				return (num[mid-1]+num[mid])/2.0;
			}
			else
			{
				return (num[mid]);
			}
	}
	public static double average(double []num)
	{
		double sum=0.0;
		for (double n:num)
		{
				sum+=n;
		}
		return sum/num.length;
	}
	
	public static double sd(double []num)
	{
		double avg=average(num);
		double sum=0.0;
		for (double n:num)
		{
				sum+=Math.pow(n-avg,2);
		}
		return Math.sqrt(sum/num.length);
	}
	
	
}