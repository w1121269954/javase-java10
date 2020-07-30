package 控制流程;

public class d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
		int a = 1234;
		int b=(a/1000%10);
		int c =(a/100%10);
		int d =(a/10%10);
		int e =(a%10);
		int f =(e*1000+d*100+c*10+b);
		System.out.println(e);
				
	}

}
