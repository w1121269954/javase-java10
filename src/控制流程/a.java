package ��������;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i = 55;
	        if (i <= 100 && i >= 90) {
	            System.out.println("�ɼ���A");
	        } else if (i >= 80) {
	            System.out.println("�ɼ���B");
	        } else if (i >= 70) {
	            System.out.println("�ɼ���C");
	        } else if (i >= 60) {
	            System.out.println("�ɼ���D");
	        } else {
	            System.out.println("�ɼ���E");
	        }
	    
	  //����һ�󣬰��겻���İ�����
	int year = 2000;
	
	if(year %400 ==0){
		System.out.println(year +"������");
	}
	else if(year %4 ==0 && year %100!=0)
	{
		System.out.println(year +"������");
	}
	else
	{
		System.out.println(year +"��������");
	}
  }
}	
