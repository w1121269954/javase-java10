package com.neuedu.test;

public class g {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean x = false;
		boolean y = true;
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		System.out.println(x^y);//相同为false, 不同为true //true
		
		System.out.println("=======================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& || 短路运算
		boolean flag1 = a>b && b++<c; //true
		
		System.out.println(b);
		
		boolean flag2 = a<b || b++>c; //true
		
		System.out.println(b);
		

		System.out.println("=======================");
		//& | 不短路
		
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		
		boolean b1 = x1>y1 & y1++ <z1;
		
		System.out.println(y1);
		
        //三元运算符
		char sex = 'F';
		String str = sex=='F'?"女":"男";
		
		int xx = 10;
		int yy = 20;
		int zz = 30;
		
		int max = xx>=yy?xx:yy;
		max = max>zz?max:zz;


//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。

         
        
        
//2.给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。


//3.华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。


//4.给定一个任意的大写字母A~Z，转换为小写字母。


		
	}

}
