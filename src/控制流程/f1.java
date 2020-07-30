package 控制流程;

public class f1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//给定一个成绩a，使用switch结构求出a的等级。A：90-100，B：80-89，C：70-79，D：60-69，E：0~59。
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
		  
		//假设某员工今年的年薪是30000元，年薪的年增长率6%。编写一个Java应用程序计算该员工10年后的年薪，
		 //并统计未来10年（从今年算起）总收入。
		  double a2 = 30000;
		  for(int i =1;i<10;i++)
		  {
			  a2 = a2*1.6;
		  }
		  System.out.println(a2);
		  
		  //输入一个数字，判断是一个奇数还是偶数
		  int a3 = 5;
		  if (a3%2==0)
		  {
			  System.out.println("偶数");
		  }
		  
		  
	  }
		
	}

}
