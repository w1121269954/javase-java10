package ��������;

public class f1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���A��90-100��B��80-89��C��70-79��D��60-69��E��0~59��
	  int a =90;
	  switch(a/10)
	  {
	  case 9:
		  System.out.println("A");
		  break;
	  case 8:
		  System.out.println("B");
		  break;
	  case 7:
		  System.out.println("c");
		  break;
	  case 6:
		  System.out.println("d");
		  break;
	  default :
		  System.out.println("e");
		  break;
		  
		//����ĳԱ���������н��30000Ԫ����н����������6%����дһ��JavaӦ�ó�������Ա��10������н��
		 //��ͳ��δ��10�꣨�ӽ������������롣
		  double a2 = 30000;
		  for(int i =1;i<10;i++)
		  {
			  a2 = a2*1.6;
		  }
		  System.out.println(a2);
		  
		  //����һ�����֣��ж���һ����������ż��
		  int a3 = 5;
		  if (a3%2==0)
		  {
			  System.out.println("ż��");
		  }
		  
		  
	  }
		
	}

}
