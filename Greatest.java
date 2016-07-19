# Greatestn
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 nos : ");
		int Num1=sc.nextInt();
		int Num2=sc.nextInt();
		int Num3=sc.nextInt();
		if((Num1>Num3)&&(Num1>Num2))
		{
			System.out.println("Num1 is greater");
		}
		else if((Num2>Num3)&&(Num2>Num1))
		{
			System.out.println("Num2 is greater");
		}
		else
		{
			System.out.println("Num3 is greater2");
		}
	}

}
