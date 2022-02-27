//program for the twos componet that is exactly most less to the input number
import java.util.Scanner;
class Powerof2
{
	public static void func(int num)
	{

		int res=1;
		for(int i=1;i<num;i++)
		{
			res=res*2;
			if(res>num)
			break;
		}
			System.out.println("num is"+res/2);
		}
	public static void main(String[] args) {
		func(10);
		func(1029);
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		func(num1);
	}
}