package ¿ØÖÆÁ÷³Ì;

public class b1 {

	public static void main(String[] args) {
		int a =80;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i+"*");
				a=a/i;
			}
			
			else
			{
				continue;
			}
		}
	}
}