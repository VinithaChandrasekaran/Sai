import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) 
	{
		int num,square,cube;
		double squareroot;
		System.out.println("Enter the number");
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		square=num*num;
		cube=square*num;
		squareroot=Math.sqrt(num);
		System.out.println("The square of a number is "+square);
		System.out.println("The cube of a number is "+cube);
		System.out.println("The square root of a number is "+squareroot);
		
		

		

	}

}
