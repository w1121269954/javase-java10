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
		System.out.println(x^y);//��ͬΪfalse, ��ͬΪtrue //true
		
		System.out.println("=======================");
		
		int a = 100;
		int b = 200;
		int c = 300;
		
		//&& || ��·����
		boolean flag1 = a>b && b++<c; //true
		
		System.out.println(b);
		
		boolean flag2 = a<b || b++>c; //true
		
		System.out.println(b);
		

		System.out.println("=======================");
		//& | ����·
		
		int x1 = 200;
		int y1 = 300;
		int z1 = 400;
		
		
		boolean b1 = x1>y1 & y1++ <z1;
		
		System.out.println(y1);
		
        //��Ԫ�����
		char sex = 'F';
		String str = sex=='F'?"Ů":"��";
		
		int xx = 10;
		int yy = 20;
		int zz = 30;
		
		int max = xx>=yy?xx:yy;
		max = max>zz?max:zz;


//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���

         
        
        
//2.����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����


//3.�����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�


//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��


		
	}

}
