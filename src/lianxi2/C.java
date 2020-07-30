package lianxi2;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//十进制
		int a = 10;
		
		//十六进制
		int b = 0*10; //16
		
		//八进制 
		int c = 010;//8
		
		//二进制
		int d = 00100;//4
		
		System.out.println(a);

		//进制互转
		//十进制向16.8.2(短除法)
		//16.8.2向10进制转（权加法）
		//十六进制和二进制，八进制和二进制的互转
		
		//十进制转换其他进制
		System.out.println(Integer.toBinaryString(100));
		System.out.println();
		
	}

}
