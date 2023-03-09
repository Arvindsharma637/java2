package Oops2;
import java.util.Scanner;

public class Pttern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j, rows;
Scanner sc=new Scanner (System.in);
System.out.println("enter the no of rows:");
rows=sc.nextInt();
for (i=1;i<=rows;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print(i+"");
		
	}
	System.out.println();
}
	}

}
