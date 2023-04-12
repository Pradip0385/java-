import statistics.Statistical;
import statistics.convert.Numcon;

public class User{
	public static void main(String args[])
	{
		double []num={1.0,2.0,3.0,4.0,5.0};
		
		System.out.println("Mean:"+Statistical.mean(num));
		System.out.println("Median:"+Statistical.median(num));
		System.out.println("Average:"+Statistical.average(num));
		System.out.println("SD:"+Statistical.sd(num));
		System.out.println("\n");
		int decimal=42;
		System.out.println("Decimal to binary:"+Numcon.dtob(decimal));
		System.out.println("Decimal to Octal:"+Numcon.dtoo(decimal));
		System.out.println("Decimal to Hex:"+Numcon.dtogh(decimal));
		System.out.println("\n");
		String binary="1010";
		System.out.println("Binary to decimal:"+Numcon.btod(binary));
		System.out.println("\n");
		
		String octal="52";
		System.out.println("Octal to decimal:"+Numcon.otod(octal));
		System.out.println("\n");
		String hex="af";
	System.out.println("Hex to decimal:"+Numcon.htod(hex));
	}
}