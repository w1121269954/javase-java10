package 控制流程;

public class e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//输出0-9之间的数，但是不包括5。
          int a = 5;
          if (0<=a && a<=9 && a!=5)
          {
        	  System.out.println(a);
          }
          else  
          {
        	  System.out.println("错误");
          }
          
          //判断一个数是不是质数，除了一和自己以外不能被其他书整除
          
          int n = 179;
          for (int i =2;i<n;i++)
          {
        	  if(n%i==0)
        		  System.out.println("不是素数");
        	  return;
          }
          System.out.println();
          
	}	
	
}