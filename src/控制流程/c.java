package 控制流程;

public class c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1+2+3+++100求和
		int sum = 0;
		int i = 1;
		while (i<=100)
		{
			sum+=i;
			i++;
		}
        System.out.println("sum="+sum);
        
        double sum2 =0;
        double i2 = 1;
        while(i2<=100)
        {
        	sum2+=1/i2;
        	 i2++;
        }
        System.out.println(sum2);
        
        int sum3 = 0;
        for(int i3=1;i<=100;i3++)
        {
        	sum3+=i3;
        }
        	System.out.println(sum3);
        	
          //输出0-9之间的数，但是不包括5。
        	
	} 

}
