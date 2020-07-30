package 控制流程;

public class j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//求两个数的最大公约数
		int m=8;
		int n=12;
		int result=1;
		for(int i=1;i<=m;i++)
		{
			if(m%i==0 && n%i==0)
			{
				result = i;
			}
		}
		System.out.println(result);
	}

}
