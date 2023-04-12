package statistics.convert;

public class Numcon{
	public static String dtob(int decimal)
	{
		return Integer.toBinaryString(decimal);
	}
	public static String dtoo(int decimal)
	{
		return Integer.toOctalString(decimal);
	}
	public static String dtogh(int decimal)
	{
		return Integer.toHexString(decimal);
	}
	
	public static int btod(String binary)
	{
		return Integer.parseInt(binary,2);
	}
	public static int otod(String octal)
	{
		return Integer.parseInt(octal,8);
	}
	public static int htod(String hex)
	{
		return Integer.parseInt(hex,16);
	}
}