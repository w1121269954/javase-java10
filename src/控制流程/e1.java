package ¿ØÖÆÁ÷³Ì;

public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 80;
		for (int i =2;i<=a;i++)
		{
			while(a!=i)
			{
				if(a%i==0)
				{
					System.out.println(i+"*");
					a=a/i;
					break;
				}
				else
				{
				    break;
				}
			}
		}

	}

}
